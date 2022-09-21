import java.util.Scanner;
class Pattern4
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
           if(((i+j)%2)==0)
           {
               System.out.print(1+" ");
           }else{
               System.out.print(0+" ");
           }
           
      }
          System.out.println();
      }
    }
}
