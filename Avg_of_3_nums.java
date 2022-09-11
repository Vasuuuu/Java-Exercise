import java.util.Scanner;
public class Avg_of_3_nums{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int avg = (n1+n2+n3)/3;
        System.out.println("Average of "+n1+", "+n2+", "+n3+" : "+avg);
    }
}
