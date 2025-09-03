import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1000,"Tom");
        map.put(2000,"Peter");
        map.put(3000,"Steve");
        map.put(11000,"Jills");
        map.put(1400,"Robby");
        System.out.println(map);//sorted way ma print karse .. key ne sort karse then print.

        System.out.println("-----------------------");

        map.forEach((k,v)-> System.out.println("key ="+ k + " Value "+ v));
        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        System.out.println("-----------------------");

        Set<Integer> keyLessThan3k = map.headMap(3000).keySet();
        System.out.println(keyLessThan3k);

        Set<Integer> keyGreaterThan3k = map.tailMap(3000).keySet();
        System.out.println(keyGreaterThan3k);

        System.out.println("-----------------------");

        TreeMap<String,Integer> userMap=new TreeMap<>();
        userMap.put("James",100);
        userMap.put("Brad",200);
        userMap.put("Albert",400);
        userMap.put("George",50);
        userMap.put("Larry",900);
        userMap.put("Ted",120);
        userMap.put("Paul",300);

        //in this TreeMap sorting based on Alphabetical Way..
        userMap.forEach((k,v)-> System.out.println("Key ="+ k + " value " + v));

        System.out.println("-----------------------");

        //IF WE want desc order sorting??
        TreeMap<Integer,String> map1=new TreeMap<>(Comparator.reverseOrder());
        map1.put(1000,"Tom");
        map1.put(2000,"Peter");
        map1.put(3000,"Steve");
        map1.put(11000,"Jills");
        map1.put(1400,"Robby");
        System.out.println(map1);










    }

}
