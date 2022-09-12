import java.util.Scanner;
public class Power{
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter base & exponent respectively : ");
       int base = in.nextInt();
       int exponent = in.nextInt();
    System.out.println(power(base,exponent));
       
    }
    static long power(int base, int exponent){
        long p = 1;
        while(exponent>0){
            p=p*base;
            exponent--;
        }
        return p;
    }
    
}
