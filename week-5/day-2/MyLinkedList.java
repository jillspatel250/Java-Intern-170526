import java.util.List;

//Java Collection FrameWork Provide By default LinkedList class but we make our own..
public class MyLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printMyLinkedList(){
        Node p=head;
        while(p!=null){
            System.out.print(p.data +"  " );
            p=p.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList ll=new MyLinkedList();
        Node first=ll.new Node(10);
        ll.head=first;

        Node second=ll.new Node(20);
        first.next=second;

        Node third=ll.new Node(30);
        second.next=third;

        ll.printMyLinkedList();




    }
}
