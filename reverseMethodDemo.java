import java.util.Scanner;
class reverseMethodDemo
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a string : ");
       StringBuffer sb = new StringBuffer(in.nextLine());
       System.out.println("Reversed string : "+sb.reverse());
    }
}
