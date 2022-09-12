import java.util.Scanner;
public class EligibleForVoteOrNot{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your age : ");
    int age = in.nextInt();
    canVote(age);
    }
    static void canVote(int age){
        if(age>=18){
            System.out.println("You can vote.");
        }else{
            System.out.println("You cannot vote.");
        }
    }
}
