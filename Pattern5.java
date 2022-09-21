import java.util.Scanner;
class Pattern5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = input.nextInt();
        pattern(rows);
    }
    static void pattern(int rows)
    {
      for(int i = 0 ; i<rows; i++)
      {
          for(int j=0; j<=i; j++)
          {
           System.out.print("* ");
          }
          System.out.println();
      }
    }
}
