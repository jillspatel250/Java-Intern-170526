import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysOfCreatingHashMap {

    public static Map<String,Integer> marksMap;
    static {
        marksMap=new HashMap<>();
        marksMap.put("A",100);
        marksMap.put("B",200);
    }
    public static void main(String[] args) {
        //1.using HashMap class
        HashMap<String,String> map1=new HashMap<>();
        Map<String,String> map2=new HashMap<>();

        //2.Static way : Static HashMap
        System.out.println(WaysOfCreatingHashMap.marksMap.get("A"));

        //3.immutable Map with only one single entry:(only one entry is their and we cannot change that entry valye)
        Map<String,Integer> map3=Collections.singletonMap("test",100);
        System.out.println(map3.get("test"));
        //map3.put("abc",200); this throw error because in SingletonMap we store only one value..
        //this throw unSupportedOperationException

        //4. using toMap method
        //creting one 2D array of Strings using Stream and Collecting in the form Map
        Map<String,String> map4= Stream.of(new String[][]{
                {"tom","A grade"},
                {"Naveen","A+ Grade"},
        }).collect(Collectors.toMap(data -> data[0],data -> data[1]));
        System.out.println(map4.get("tom"));
        map4.put("Lisa","A++ Grade");
        System.out.println(map4.get("Lisa"));

        //Using SimpleEntry:-
        Map<String,String> map6=Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("Navven","Java"),
                new AbstractMap.SimpleImmutableEntry<>("Tom","Python")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map6.get("Tom"));
        map6.put("Steve","Ruby");
        System.out.println(map6.get("Steve"));

        //JDK 1.9
        //Empty Map
        Map<String,String> emptryMap=Map.of();//this return an Empty Map
        //emptryMap.put("Tom","Python");
        //System.out.println(emptryMap.put("Tom")); this will through exception UnsupportedOperatonException we define Empty Map so we not put anythiing in that..

        //Singleton map:-
        Map<String,String> singletonMap=Map.of("K1","V1");
        System.out.println(singletonMap.get("K1"));
        //singletonMap.put("K2","V2");
       // System.out.println(singletonMap.get("K2"));//this will through exception UnsupportedOperatonException we define Single entry Map so we not put other pair in that.

        //MultiValues Map:- max 10 pair can be stored
        Map<String,String> multiMap=Map.of("K1","V1","K2","V2","K3","V3");
        System.out.println(multiMap.get("K3"));

        //ofEntry method : no limitation on paris(key-value)
        Map<String,Integer> map7=Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300)
        );
        System.out.println(map7.get("C"));
    }
}
