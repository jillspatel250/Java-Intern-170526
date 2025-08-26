import java.util.*;

//collection interface methiods are generic they support object of any class
public class CollectionInterface {
    public static void main(String[] args) {
       Collection<String> fruits=new ArrayList<>();

       //add method
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("papaya");
        System.out.println(fruits);

        //addAll(Collection c) — add multiple elements from another collection
        Collection<String> morefruites= Arrays.asList("cherry","guawawa","banana");
        fruits.addAll(morefruites);
        System.out.println(fruits);

        //remove(Object o) — remove a specific element
        fruits.remove("cherry");
        System.out.println(fruits);

        //removeAll(Collection c) — remove all matching elements
        Collection<String> removeList = Arrays.asList("apple", "mango");
        fruits.removeAll(removeList);
        System.out.println(fruits);

        //retainAll(Collection c) — keep only matching elements
        Collection<String> retainlist=Arrays.asList("cherry","papaya");
        fruits.retainAll(retainlist);
        System.out.println(fruits);


        System.out.println("Contains 'cherry'? " + fruits.contains("papaya"));

        System.out.println("Contains both Cherry & Papaya? " + fruits.containsAll(retainlist));

        System.out.println("size "+ fruits.size());

        System.out.println("Is collection empty? " + fruits.isEmpty());

        //iterator
        Collection<String> newlist=Arrays.asList("Einfochips","arrow","intern");
        Iterator<String> it= newlist.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //convert to array
        Object [] array=fruits.toArray();//toArray() return object so thats why we store that in Object []
        //if we need String from toArray so we need to pass toArray(new String[0]).. so it return String



        //if we only print sout(array) then it print bad output hashcode@type..
        //so for good output we use toString...
        System.out.println(Arrays.toString(array));








    }
}