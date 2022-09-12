import java.util.Scanner;
public class countPositiveNegativeZeroNums{
public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("Enter a number : ");
int num = in.nextInt();
int[] nums = new int[num];
System.out.println("Enter "+num+" numbers : ");
for(int i=0;i<num;i++){
    nums[i]=in.nextInt();
}
int countPositive=0;
int countNegative=0;
int countZeroes=0;
for(int i=0;i<num;i++){
    if(nums[i]<0){
        countNegative+=1;
    }else if(nums[i]>0){
        countPositive+=1;
    }else{
        countZeroes+=1;
    }
    
}
System.out.println("Positive numbers : "+countPositive);
System.out.println("Negative numbers : "+countNegative);
System.out.println("Number of zeroes : "+countZeroes);


}    
}
