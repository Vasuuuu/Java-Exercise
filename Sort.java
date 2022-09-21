import java.util.Arrays;
import java.util.Scanner;
class Sort
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len = input.nextInt();
        int[] array = new int[len];
        System.out.println("Enter "+len+" numbers : ");
        for(int i=0; i<len;i++)
        {
            array[i]=input.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted array : "+Arrays.toString(array));
    }
}
