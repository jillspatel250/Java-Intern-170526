import java.util.HashMap;

//that is a collection that does not maintain any order
//no order - no indexes
//store valyes - key value form
//key cannot be duplicate
//we store n numbers of null values but only one null key
//hashMap is not synchronized  (not thread-safe)
public class HashMapDemo1 {

    public static void main(String[] args) {
        HashMap<String,String> capitaMap=new HashMap<>();
        capitaMap.put("India","New Delhi");
        capitaMap.put("USA","Washington DC");
        capitaMap.put("UK","London");
        capitaMap.put("India","Patan");// we say that key cannot be duplicate but if we do that then new is overwrite..

        //we store n numbers of null values but only one null key
        capitaMap.put(null,"Jills");
        capitaMap.put(null,"patel");// this null is no overwrite and value is patel
        capitaMap.put("1",null);
        capitaMap.put("2",null);
        capitaMap.put("3",null);
        capitaMap.put("4",null);
        capitaMap.put("5",null);


        System.out.println(capitaMap);
        System.out.println(capitaMap.get("USA"));
        System.out.println(capitaMap.get("Chaina"));
        System.out.println(capitaMap.get("India"));
        System.out.println(capitaMap.get(null));
        System.out.println(capitaMap.get("1"));


    }
}
