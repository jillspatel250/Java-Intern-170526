import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("mango");
        System.out.println(list);

        //insert at specific index
        list.add(1,"apple");
        System.out.println(list);

        List<String> Fruits=Arrays.asList("orange","papaya");
        list.addAll(Fruits);
        System.out.println(list);

        //replace element
        list.set(1,"jills");
        System.out.println(list);

        //find first occurrence
        System.out.println(list.indexOf("jills"));

        //last occurrence
        list.add("jills");
        System.out.println(list);
        System.out.println(list.lastIndexOf("jills"));

        //get sublist
        List<String> sublist=list.subList(1,4);
        System.out.println(sublist);

        //remove specific element(this delete only first occurrence) of that element
        list.remove("jills");
        System.out.println(list);

        //check exists or not
        System.out.println(list.contains("mango"));

        //list iterator
//        List<String> it= (List<String>) list.iterator();
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }

        Iterator<String> s=list.iterator();
        //remove all element
        list.clear();
        System.out.println(list);







    }
}