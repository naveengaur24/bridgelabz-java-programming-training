package DSA.Stack;

public class LinkedListImplementation {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // top of stack

    public LinkedListImplementation() {
        top = null;
    }

    // PUSH
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  // link new node to current top
        top = newNode;       // move top to new node
    }

    // POP
    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        int popped = top.data;
        top = top.next;  // move top down
        return popped;
    }

    // PEEK
    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    // DISPLAY
    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // MAIN
    public static void main(String[] args) {
        LinkedListImplementation stack = new LinkedListImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.display();

        System.out.println("\n--------------------");
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("\n--------------------");
        System.out.println("Top element: " + stack.peek());
    }
}