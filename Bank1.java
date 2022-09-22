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
    public boolean search(long accno)
    {
        if(acc_no==accno)
        {
            display();
            return true;
        }else{
            return false;
        }
    }
}
class Bank1{
public static void main(String[] args)
{
/*  user1.openAccount();
    user1.deposit();
    user1.withdraw();
    user1.display();
    user1.withdraw();
    user1.display(); */
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of customers : ");
    int num = in.nextInt();
  BankAccount[] c = new BankAccount[num];
  for(int i=0; i<num; i++)
  {
      c[i]= new BankAccount();
      c[i].openAccount();
  }
  int ch;
  long ac_no;
  boolean found;
 
     do{ System.out.println("1.Display account details \n 2.Deposit amount \n 3.Withdraw amount \n4.Display all account details. \n5.Exit");
      ch = in.nextInt();
switch(ch){

case 1 :
    System.out.println("*** Search your bank account ***");
    System.out.println("Enter account number you want to search: ");  
         ac_no = in.nextLong();  
         found = false;  
        for (int i = 0; i < c.length; i++) 
        {  
         found = c[i].search(ac_no);  
         if (found) {  
         break;  
         }  
        }  
       if (!found) {  
    System.out.println("Search failed! Account doesn't exist..!!");  
      }  
     break;  
case 2:
    System.out.println("*** Deposit in your bank account ***");
    System.out.println("Enter account number you want to deposit in : ");  
 ac_no = in.nextLong();  
 found = false;  
for (int i = 0; i < c.length; i++) 
{  
    found = c[i].search(ac_no);  
    if (found) {  
        c[i].deposit();
    break;  
    }  
}  
if (!found) {  
System.out.println("Search failed! Account doesn't exist..!!");  
}  
break;  
case 3:
System.out.println("*** Withdraw from your account ***");
    System.out.println("Enter account number you want to withdraw from : ");  
 ac_no = in.nextLong();  
 found = false;  
for (int i = 0; i < c.length; i++) 
{  
    found = c[i].search(ac_no);  
    if (found) {  
        c[i].withdraw();
    break;  
    }  
}  
if (!found) {  
System.out.println("Search failed! Account doesn't exist..!!");  
}  
break;  

case 4:System.out.println("*** All account details *** ");  
 ac_no = in.nextLong();  
 found = false;  
for (int i = 0; i < c.length; i++) 
{  
    c[i].display();
}
break;
case 5: System.out.println("Exit.");
}
    
}while(ch!=5);
}
}
