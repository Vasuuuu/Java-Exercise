import java.util.Scanner;
public class Circumference{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the radius of circle : ");
    double r = in.nextDouble();
    System.out.println("Circumference of circle : "+circumference(r));
    }
    static double circumference(double r){
        return 2*3.14159*r;
    }
}
