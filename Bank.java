import java.util.Scanner;
class BankAccount
{
    private String name;
    private String acc_type;
    private long acc_no;
    private long balance;
    
    Scanner in = new Scanner(System.in);
    
    //method to assign initial values
    public void openAccount()
    {
        System.out.println("Enter your full name : ");
        name = in.nextLine();
        System.out.println("Enter account type : ");
        acc_type = in.next();
        System.out.println("Enter account number : ");
        acc_no = in.nextLong();
        System.out.println("Enter balance : ");
        balance = in.nextLong();
    }
    
    //method to deposit an amount
    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit : ");
        long amount = in.nextLong();
        balance = balance+amount;
    }
    
    //method to withdraw amount after checking balance
    public void withdraw()
    {
        System.out.println("Enter amount you want to withdraw : ");
        long amount = in.nextLong();
        if(balance>=amount)
        {
            balance = balance - amount;
            System.out.println("Balance after withdrawal : "+balance);
        }else{
            System.out.println("Balance less than "+amount+"."+"\tTransaction failed !");
        }
    }
    
    //method to display account details
    public void display()
    {
        System.out.println("Name of account holder : "+name);
        System.out.println("Account number : "+acc_no);
        System.out.println("Account type : "+acc_type);
        System.out.println("Balance : "+balance);
    }
}
class Bank{
public static void main(String[] args)
{
    BankAccount user1 = new BankAccount();
    user1.openAccount();
    user1.deposit();
    user1.withdraw();
    user1.display();
    user1.withdraw();
    user1.display();
}
}
