import java.util.*;
class BubbleSort
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
        System.out.println("Sorted array : "+Arrays.toString(bubbleSort(array,len)));
    }
    static int[] bubbleSort(int[] array,int len)
    {
      for(int i = 0 ; i<len; i++)
      {
         for(int j=i+1;j<len;j++)
         {
             if(array[i]>array[j]){
                 int temp=array[i];
                 array[i]=array[j];
                 array[j]=temp;
             }
         }
      }
      return array;
    }
}
