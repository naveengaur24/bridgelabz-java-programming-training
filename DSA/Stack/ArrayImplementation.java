package DSA.Stack;

public class ArrayImplementation {
    public int[] stack;
    public int top;

    public ArrayImplementation(int capacity){
        stack=new int[capacity];
        top=-1;
    }
    public void push(int value){
        if(top==stack.length-1){
            System.out.println("Stack is full");
            return;
        }
        stack[++top]=value;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public void display(){
        for(int i=top;i>=0;i--){
            System.out.print(stack[i]+"  ");
        }
    }
    public static void main(String[] args) {
            ArrayImplementation stack=new ArrayImplementation(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);
            stack.display();
            System.out.println("\n---------------------------------------");
            System.out.println("Popped element: "+stack.pop());
            System.out.println("Popped element: "+stack.pop());
            stack.display();
            System.out.println("\n---------------------------------------");
            System.out.println("Top element: "+stack.peek());

    }
}
