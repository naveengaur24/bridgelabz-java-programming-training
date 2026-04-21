package DSA.Queue;

public class ArrayImplementation {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    public ArrayImplementation(int capacity){
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public void enqueue(int value){
        if(size==queue.length){
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1);
        queue[rear]=value;
        size++;
    }
    public int dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        int value=queue[front];
        front=(front+1);
        size--;
        return value;
    }

    public int peek(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)]+"  ");
        }
    }

    public static void main(String[] args) {
        ArrayImplementation queue=new ArrayImplementation(5);
        queue.enqueue(10);  
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);  
        queue.display();
        System.out.println("\n---------------------------------------");
        System.out.println("Dequeued element: "+queue.dequeue());
        System.out.println("Dequeued element: "+queue.dequeue());   
        queue.display();
        System.out.println("\n---------------------------------------");
        System.out.println("Front element: "+queue.peek());

    }
}
