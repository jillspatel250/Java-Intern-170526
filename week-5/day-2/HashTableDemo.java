import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Map<String,Integer> marks=new Hashtable<>();
        marks.put("James",100);
        marks.put("Brad",200);
        marks.put("Albert",400);
        marks.put("George",50);
        marks.put("Larry",900);
        marks.put("Ted",120);
        //marks.put(null,700); this give error because in HashTable null key and null value are not allowd..

        System.out.println(marks.get("James"));


    }
}
