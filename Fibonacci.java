import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        fibonacci(num);
    }
    static void fibonacci(int num)
    {
      int a = 0;
      int b = 1;
      System.out.print("Fibonacci series : "+a+" "+b+" ");
      for(int i=2;i<num;i++)
      {
          int next = a+b;
          System.out.print(next+" ");
          a=b;
          b=next;
      }
    }
}
