package DSA.Queue;

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
    private Node front;
    private Node rear;
    private int size;

    public LinkedListImplementation() {
        front = null;
        rear = null;
        size = 0;
    }

    // ENQUEUE (Insert at rear)
    public void enqueue(int value) {
        Node newNode = new Node(value);

        if (size == 0) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // DEQUEUE (Remove from front)
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }

        int value = front.data;
        front = front.next;

        size--;

        // IMPORTANT: if queue becomes empty
        if (size == 0) {
            rear = null;
        }

        return value;
    }

    // PEEK
    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // DISPLAY
    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }

    // MAIN
    public static void main(String[] args) {
        LinkedListImplementation queue = new LinkedListImplementation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        System.out.println("\n---------------------------------------");
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        queue.display();

        System.out.println("\n---------------------------------------");
        System.out.println("Front element: " + queue.peek());
    }
}