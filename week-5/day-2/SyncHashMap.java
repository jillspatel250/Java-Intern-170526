import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SyncHashMap {
    //synchronizedMap method is in Collection class..
    public static void main(String[] args) {
        Map<String,String> map1=new HashMap<>();
        map1.put("1","Navven");
        map1.put("2","Tom");
        map1.put("3","Lisa");

        //this map1 is not thread safe and we need to make that is in Sync..
        //create SynchronizedMap:
        Map<String,String> syncMap=Collections.synchronizedMap(map1);
        System.out.println(syncMap);

        //ConcurrentHashMap:it does not throw ConcurrentModificationExcption becuase it enable thread-safe so this class not throw this exception
        ConcurrentHashMap<String,String> concurrentHashMap=new ConcurrentHashMap<>();
        concurrentHashMap.put("A","Java");
        concurrentHashMap.put("B","Python");
        concurrentHashMap.put("C","Ruby");
        System.out.println(concurrentHashMap.get("A"));

    }
}
 
