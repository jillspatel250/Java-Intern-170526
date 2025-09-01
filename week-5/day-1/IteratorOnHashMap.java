import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//NOTE:-
//we dont direct apply .iterator method on map we need to first use .keyset() or entrySet() then and then we use ..

public class IteratorOnHashMap {
    public static void main(String[] args) {
        HashMap<String,String> capitaMap=new HashMap<>();
        capitaMap.put("India","New Delhi");
        capitaMap.put("USA","Washington DC");
        capitaMap.put("UK","London");
        capitaMap.put("India","Patan");

        //there is two types of iteration
        //1st for key and 2nd is for values


        //iterator:-
        //keySet return the key that and on that Set we iterate..
        Iterator<String> it=capitaMap.keySet().iterator();
        while (it.hasNext()){
            String key=it.next();
            String value=capitaMap.get(key);
            System.out.println("key =" +key+" value = "+value);
        }

        System.out.println("-------------------------");

        //iterator over the set(Pair) by using entrySet()
        Iterator<Entry<String,String>> it1= capitaMap.entrySet().iterator();
        while (it1.hasNext()){
            Entry<String,String> entry=it1.next();
            System.out.println("key = "+entry.getKey() + " and value = "+ entry.getValue());
        }

        System.out.println("-------------------------");

        //iterate hashmao using lambda..
        capitaMap.forEach((k,v)-> System.out.println("key = "+k +" value " + v));

    }
}
