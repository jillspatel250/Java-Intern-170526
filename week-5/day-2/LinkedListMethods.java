import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
public class LinkedListMethods {
    public static void main(String[] args) {
        //LL is default class in Java
        //it can be used as List,Stack ,Queue.. LL have implementation of All this interfaces
        //it allow the null entry
        //dynamic collection
        //hence insertion and deletion can be easily implemented
        //it is not synchronized(not thread Safe)
        //in LL, manupliation is fast becasue we dont need shifting like in array we do

        //LL constructos:-
        //LinkedList();
        //LinkedList(Collection c);

        LinkedList<String> names=new LinkedList<>();//this is doubly linkedlist..
        System.out.println(names.size());

        names.add("Tom");
        names.add("Naveen");
        names.add("Robby");
        names.add("Lisa");

        System.out.println(names.size());

        System.out.println(names);
        System.out.println(names.get(1));

        Iterator<String> it=names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        names.add(3,"Jills");
        System.out.println(names);

        List<String> users=new LinkedList<>();
        users.add("Peter");
        users.add("Trump");

        names.addAll(users);
        System.out.println(names);

        names.addFirst("Kamala");
        System.out.println(names);

        names.addLast("Einfochips");
        System.out.println(names);

        //sort
        Collections.sort(names);

       names.remove(2);
        System.out.println(names);

        names.removeAll(users);
        System.out.println(names);

        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        names.clear();
        System.out.println(names);






    }
}
