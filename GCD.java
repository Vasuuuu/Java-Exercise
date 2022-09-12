import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter two numbers : ");
       int n1= in.nextInt();
       int n2= in.nextInt();
       System.out.println(gcd(n1,n2));
    }
    static int gcd(int n1,int n2){
        while(n1!=n2){if(n1>n2){
            n1=n1-n2;
        }else{
            n2=n2-n1;
        }}
        return n1;
    }
}
