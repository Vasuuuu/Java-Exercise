import java.util.Scanner;
class Pattern1
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
      for(int i = 1; i<=rows; i++)
      {
          for(int j=1; j<=i; j++)
          {
              System.out.print(i+" ");
          }
          System.out.println();
      }
    }
}
