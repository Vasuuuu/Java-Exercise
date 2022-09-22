import java.util.Scanner;
class TestSubstring
{
    public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter your string : ");
      String str = in.nextLine();
      System.out.println("Enter number of characters to be extracted from your string : ");
      int m = in.nextInt();
      System.out.println("Enter starting index : ");
      int n = in.nextInt();
      String substr = str.substring(n,(n+m));
      System.out.println("Substring : "+substr);
   }
}
