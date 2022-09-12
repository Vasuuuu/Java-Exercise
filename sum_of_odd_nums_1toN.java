import java.util.Scanner;
public class sum_of_odd_nums_1toN{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
System.out.println("Enter a number : ");
int n = in.nextInt();
int sum = 0;
for(int i=1;i<=n;i++){
    if(i%2!=0){
        sum=sum+i;
    }
}
System.out.println("Sum of odd numbers from 1 to "+n+" is : "+sum);
    }
}
