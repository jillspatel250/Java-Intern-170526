import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HowToReverseTheLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lang=new LinkedList<>();
        lang.add("JAVA");
        lang.add("C++");
        lang.add("Ruby");
        lang.add("JavaScript");

        System.out.println(lang);

        Iterator<String> it=lang.descendingIterator();//pointer is now move opposite side
        System.out.println("Print in reverse order");
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
