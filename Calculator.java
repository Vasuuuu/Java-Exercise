import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers : ");
    int n1= in.nextInt();
    int n2= in.nextInt();
    System.out.println("Enter an operator  (+,-,*,/,%) : ");
    char op = in.next().charAt(0);
    System.out.println("Result : "+cal(n1,n2,op));
    }
    static int cal(int n1, int n2, char op){
        int result;
        switch(op){
            case '+': result= n1+n2;
            break;
            case '-': result= n1-n2;
            break;
            case '*': result= n1*n2;
            break;
            case '/': result= n1/n2;
            break;
            case '%': result= n1%n2;
            break;
            default: 
            result = -1;
            System.out.println("Invalid expression.");
        }
        return result;
    }
}
