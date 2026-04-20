package DoublyLinkedList;

public class Implementation {
    public Node head;
    public Node tail;
    public int size;
    public Implementation(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
        size++;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            node.prev=tail;
            tail=node;
        }
    }

    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            head=head.next;
            head.prev=null;
        }
        size--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
        }else{
            tail=tail.prev;
            tail.next=null;
        }
        size--;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"--> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        Node(int value){
            this.value=value;
        }
        Node(int value, Node next, Node prev){
            this.value=value;
            this.next=next;
            this.prev=prev;
        }
    }
    public static void main(String[] args) {
        Implementation dll=new Implementation();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.display();
        System.out.println("------------------------------");
        dll.insertLast(40);
        dll.insertLast(50);
        dll.display();
        System.out.println("------------------------------");
        dll.removeFirst();
        dll.display();
        System.out.println("------------------------------");
        dll.removeLast();
        dll.display();

    }
}
