import java.util.Scanner;
class test_length_capacity_method
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter a string : ");
       String str = in.nextLine();
       StringBuffer sb = new StringBuffer(str);
       System.out.println("str.length() = "+str.length());
       System.out.println("sb.length() = "+sb.length());
       System.out.println("sb.capacity() = "+sb.capacity());
    }
}
