import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        //unique value is their
        //null is allowd
        Set<String> hs=new HashSet<>();
        hs.add("Alpha");
        hs.add("Testing");
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Alpha");
        hs.add(null);
        hs.add(null);

        System.out.println(hs);
        System.out.println(hs.contains("Testing"));

        System.out.println("--------------------------------");
        //iterate using for loop
        for (String e:hs){
            System.out.println(e);
        }
        System.out.println("--------------------------------");

        //iterate using iterator
        Iterator<String> it=hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        hs.remove("Beta");
        System.out.println(hs);

        Set<Integer> first=new HashSet<>();
        first.addAll(Arrays.asList(new Integer[]{1,3,4,5,6,8,9,10}));

        Set<Integer> second=new HashSet<>();
        second.addAll(Arrays.asList(new Integer[]{1,2,3,5,6,7,9}));

        //get the union:
        Set<Integer> union=new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);

        //get the intersection:-
        Set<Integer> intersection=new HashSet<>(first);
        intersection.retainAll(second);
        System.out.println(intersection);

        //get the diff:-
        Set<Integer> diff=new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);

        //HashSet Internally Use HashMap..



    }
}
