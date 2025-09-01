/*
What is the diff between sync arrayList and non-sync arrayList
-> in java ArrayList class is not give feature of thread-safe so that is not by default sync..

two ways to Synchronized arrayList in java.
 1.Collecions.synchronizedList() - methid return sync list
 2.copyOnWriteArrayList - this is same as a ArrayList class but diff
        is this is thread-safe and arrayList is not thread-safe
 */

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncronizedArrayList {

    public static void main(String[] args) {

        //1st way Collecions.synchronizedList() - methid return sync list
        List<String> nameList= Collections.synchronizedList(new ArrayList<String>());

        //add,remove - we dont need explicit Synchronization

        //to fetch/travserse the value from this list -- we have to use explicit Synchronization

        synchronized (nameList) {
            Iterator it = nameList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }

        //2nd way copyOnWriteArrayList class
        CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<>();
        empList.add("Tom");
        empList.add("Steve");
        empList.add("Navven");

        //here we dont need to explicit use synchronization for any operations: add/remove/traverse

        Iterator<String> it2=empList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }




    }



}
