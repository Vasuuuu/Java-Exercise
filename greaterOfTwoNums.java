import java.util.Scanner;
public class greaterOfTwoNums{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two num : ");
    int n1 = in.nextInt();
    int n2 = in.nextInt();
    greater(n1,n2);
    }
    static void greater(int n1, int n2){
        if(n1>n2){
            System.out.println("Greatest number : "+n1);
        }else{
            System.out.println("Greatest number : "+n2);
        }
    }
}
