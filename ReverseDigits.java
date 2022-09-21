import java.util.Scanner;
class ReverseDigits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Reverse digits of "+num+" : "+reverseNum(num));
    }
    static int reverseNum(int num)
    {
        int sum = 0;
        while(num>0)
        {
            int r = num%10;
            num = num/10;
            sum = (sum*10) + r;
        }
        return sum;
    }
}
