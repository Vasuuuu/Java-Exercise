class Stack
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
        Stack stack = new Stack(5);
        System.out.println("Size of stack : "+stack.size);
        System.out.println("Initial top : "+stack.top);
        System.out.println("Stack is empty : "+stack.isEmpty());
        stack.peek();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.display();
        stack.pop();
        stack.display();
        stack.push(5);
        stack.push(6);
        stack.peek();
        System.out.println("Final top : "+stack.top);
    }
}
