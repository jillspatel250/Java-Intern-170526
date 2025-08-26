import java.util.*;
//array have a fixed size so we use Linkedlist but linkedlist have also disadvatage
// linkedlist need extra memory for that next and previous pointer
public class LinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();

        LinkedList<Integer> ll2 = new LinkedList<Integer>(List.of(10, 20, 30,70));

        ll.add(11);
        ll.add(22);
        ll.addAll(ll2);
        ll.add(3,99);

        ll.addFirst(9);
        ll.addLast(9);

        System.out.println("before removing "+ll);

        ll.removeFirst();
        ll.removeLast();

        System.out.println("After removing"+ll);

        System.out.println("peek element:"+ll.peek());

        System.out.println("peek last element"+ll.peekLast());

        //remove first element
        ll.poll();

        //remove last element
        ll.pollLast();

        ll.forEach(n->show(n));

        }
        static void show(int n){
            if(n<60){
                System.out.println(n);
        }







    }
}