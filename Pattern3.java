import java.util.Scanner;
class Pattern3
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
        int alpha = 65;
      for(int i = 0 ; i<rows; i++)
      {
          for(int j=0; j<=i; j++)
          {
    System.out.print(((char)(i+alpha))+" ");
          }
          System.out.println();
      }
    }
}
