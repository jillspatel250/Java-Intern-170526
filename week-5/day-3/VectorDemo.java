import java.util.Vector;
import java.util.stream.Collectors;
import java.util.*;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> myVector=new Vector<>();
        myVector.add(2);
        myVector.add(4);
        myVector.add(6);
        myVector.add(8);
        myVector.add(10);
        myVector.add(12);
        myVector.add(14);
        myVector.add(16);
        System.out.println(myVector);

        System.out.println(myVector.get(1));

        myVector.remove(3);
        System.out.println(myVector);

        Vector<Integer> yourVector=new Vector<Integer>();
        yourVector.add(10);
        yourVector.add(11);

        myVector.addAll(yourVector);
        System.out.println(myVector);

        System.out.println("-------------------");

        for(Integer e:myVector){
            System.out.println(e);
        }
        System.out.println("-------------------");

        for(int p=0;p<myVector.size();p++){
            System.out.println(myVector.get(p));
        }
        System.out.println("-------------------");
        Iterator<Integer> it=myVector.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Collections.sort(myVector);
        System.out.println(myVector);




    }
}
