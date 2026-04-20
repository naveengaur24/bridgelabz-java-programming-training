package CircularLinkedList;

public class Implementation {

    Node head;
    Node tail;
    int size;

    public Implementation(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=head;
        }else{
            node.next=head;
            head=node;
            tail.next=head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=head;
        }
        else{
            tail.next=node;
            tail=node;
            tail.next=head;
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
            tail.next=head;
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
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
        }
    }

    public void display(){
        Node temp=head;
        for(int i=0;i<size;i++){
            System.out.print(temp.value+"--> ");
            temp=temp.next;
        }
        System.out.println();
    }

    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
