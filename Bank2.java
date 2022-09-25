import java.util.Scanner;
class BankAccount
{
    private String name;
    private String acc_type;
    private long acc_no;
    private double balance;
    
    Scanner in = new Scanner(System.in);
    
    //method to assign initial values
    public void openAccount(String name,String acc_type,long acc_no,double balance)
    {
        this.name = name;
        this.acc_type = acc_type;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    
    //method to deposit an amount
    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit : ");
        
        double amount = in.nextDouble();
        balance = balance+amount;
    }
    
    //method to withdraw amount after checking balance
    public void withdraw()
    {
        System.out.println("Enter amount you want to withdraw : ");
        double amount = in.nextDouble();
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
class Bank2{
public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    System.out.println("**** Open new Bank Account ****");
    System.out.println("Enter your full name : ");
    String name = in.nextLine();
    System.out.println("Enter account type : ");
    String acc_type = in.next();
    System.out.println("Enter account number : ");
    long acc_no = in.nextLong();
    System.out.println("Enter balance : ");
    double balance = in.nextDouble();
    BankAccount b = new BankAccount();
    b.openAccount(name,acc_type,acc_no,balance);
    System.out.println("**** Your account successfully created ****");
    int choice;
    do{
    System.out.println("\n1.Deposit\n2.Withdraw\n3.View account details\n4.Exit");
    choice = in.nextInt();
    switch(choice)
    {
        case 1: b.deposit();
        break;
        case 2: b.withdraw();
        break;
        case 3: b.display();
        break;
        case 4: System.out.println("Exit");
        break;
        default: System.out.println("Invalid choice!");
    }
        
    }while(choice!=4);
}
}
