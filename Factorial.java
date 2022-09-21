import java.util.Scanner;
class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        System.out.println("Factorial : "+factorial(num));
    }
    static int factorial(int num)
    {
        int fact = 1;
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        return fact;
    }
}
