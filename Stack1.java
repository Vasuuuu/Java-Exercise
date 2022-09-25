import java.util.Scanner;
class Stack1
{
    int size;
    int top = -1;
    int[] stack;
    Stack(int size){
        this.size=size;
        stack = new int[size];
    }
    boolean isEmpty(){
        return (top < 0);
    }
    void push(int x){
        if(top>=(size-1)){
            System.out.println("Stack overflow!");
        }else{
            stack[++top]=x;
            System.out.println(x+" pushed in stack.");
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
        }else{
            --top;
            
        }
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow.");
        }else{
            System.out.println("Top of stack : " +stack[top]);
        }
    }
    void display(){
        
      for(int i=0;i<=top;i++){
          System.out.print(stack[i]+" ");
      }
      System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of stack : ");
        Stack stack = new Stack(in.nextInt());
        System.out.println("Size of stack : "+stack.size);
        System.out.println("Initial top : "+stack.top);
        System.out.println("Initially Stack is empty : "+stack.isEmpty());
        int choice;
        
    do{
        System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Display your stack\n5.Exit");
        choice = in.nextInt();
        switch(choice)
        {
            case 1: System.out.println("Enter a number to push in stack : ");
            stack.push(in.nextInt());
            break;
            case 2: stack.pop();
            break;
            case 3: stack.peek();
            break;
            case 4: stack.display();
            break;
            case 5: System.out.println("Exit");
            break;
            default: System.out.println("Invalid choice!");
        }
      }while(choice!=5);
    }
}
