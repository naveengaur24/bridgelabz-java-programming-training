package DoublyLinkedList;

public class Implementation {
    public Node head;
    public Node tail;
    public int size;
    public Implementation(){
        this.size=0;
    }

    public class Node{
        private int value;
        private Node next;
        private Node prev;
    }
}
