import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//question:-how to compare two hashMap
//there is a three types of compersion:-
//1.basis on key and value both
//2.basis on only key
//3.basis on only value

public class HowToCompareHashMap {

    public static void main(String[] args) {
        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer,String> map2=new HashMap<>();
        map2.put(3,"C");
        map2.put(1,"A");
        map2.put(2,"B");

        HashMap<Integer,String> map3=new HashMap<>();
        map3.put(3,"C");
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"D");

        //1.basis on key and value both
        System.out.println(map1.equals(map2));
        System.out.println(map3.equals(map1));

        System.out.println("----------------------");
        //2.compare hashmap for the same keys
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map3.keySet().equals(map2.keySet()));

        //3.find out extra keys:-
        HashMap<Integer,String> map4=new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        //1st step for finding extra key is combine the keys from both side maps using HashSet()
        //step:- union of both key then remove from 1st so extra key is printed..
        HashSet<Integer> combineKeys=new HashSet<>(map1.keySet());
        //2nd step add the keyset from map4
        combineKeys.addAll(map4.keySet());
        System.out.println(combineKeys);
        combineKeys.removeAll(map1.keySet());//this is print extra key
        System.out.println(combineKeys);

        //4.Compare maps by values:-
        HashMap<Integer,String> map5=new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");

        HashMap<Integer,String> map6=new HashMap<>();
        map6.put(4,"C");
        map6.put(5,"A");
        map6.put(6,"B");

        HashMap<Integer,String> map7=new HashMap<>();
        map7.put(1,"C");
        map7.put(2,"A");
        map7.put(3,"B");
        map7.put(4,"D");
        System.out.println("-------------------------");


        //duplicate are not allowed in values then how we check : using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));

        System.out.println("-------------------------");
        //duplicate are allowd: then we use HashSet
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));















    }
}
