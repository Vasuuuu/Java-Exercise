import java.util.Scanner;
class Sum_of_digits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = input.nextInt();
        System.out.println("Sum of digits of "+num+" : "+sod(num));
    }
    static int sod(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int r = num%10;
            num = num/10;
            sum = sum + r;
        }
        return sum;
    }
}
