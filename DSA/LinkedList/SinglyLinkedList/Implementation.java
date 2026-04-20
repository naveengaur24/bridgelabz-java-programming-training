package SinglyLinkedList;

public class Implementation{
    private Node head;
    private Node tail;
    private int size;

    public Implementation(){
        this.size=0;
    }

    public void insertFirst(int value){
        System.out.println("Inserting "+value+" at the beginning of the list");
        Node node=new Node(value);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size+=1;
    }

    public void insertAtindex(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value, temp.next);
        temp.next=node;
        size+=1;
    }



    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size-=1;
    }

    public Node deleteLast(){
        if(head==null){
            return null;
        }

        if(head.next==null){
            return null;
        }
        Node secondLast=head;

        while(secondLast.next.next!=null){
            secondLast=secondLast.next;
        }
        secondLast.next=null;
        return head;
    }

    public void reverse(){
        Node prev=null;
        Node current=head;
        Node next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +"---->  ");
            temp=temp.next;
        }
    }
    

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        }
    }
    public static void main(String[] args) {
        Implementation list=new Implementation();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();

        System.out.println("\n---------------------------------------");
        list.insertLast(6);
        list.insertLast(7);
        list.display();
        System.out.println("\n---------------------------------------");
        list.insertAtindex(5,4 );
        list.display();
        System.out.println("\n---------------------------------------");
        list.deleteFirst();
        list.display();

        System.out.println("\n---------------------------------------");
        list.deleteLast();
        list.display();
        System.out.println("\n---------------------------------------");
        list.reverse();
        list.display();
        
    }
}

