import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> ar=new ArrayList<>();
        ar.add("java");
        ar.add("python");
        ar.add("ruby");
        ar.add("javascript");

        ArrayList<String> ar1=new ArrayList<>();
        ar1.add("Testing");
        ar1.add("dev ops");

       // ar1.addAll(ar);
        //  System.out.println(ar1);

        ar.addAll(2,ar1);
        System.out.println(ar);

       // ar1.clear();
        //System.out.println(ar1);

        //ar1.clone return return Object so we type case and store in that type.. what we need
       ArrayList<String> cloneList= (ArrayList<String>)ar1.clone();
        System.out.println(cloneList);

        System.out.println(ar1.contains("python"));

        System.out.println(ar1.indexOf("python"));
        System.out.println(ar1.indexOf("Testing"));

        ArrayList<String> list1=new ArrayList<>(Arrays.asList("Navven","Tom","Steve","Lisa","Navven"));
        System.out.println(list1);
        System.out.println(list1.getLast());
        int last=list1.lastIndexOf("Navven");
        System.out.println(last);

        list1.remove(1);
        System.out.println(list1);

        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numbers.removeIf(num -> num%2 ==0 ); //here we pass predicate which true then return or remove that from list
        System.out.println(numbers);

        ArrayList<String> namesList=new ArrayList<>(Arrays.asList("Navven","Tom","Steve","Lisa","Navven","Tom"));
        System.out.println(namesList);

        //singleton() creates a set with only one element.
        //and that we pass like {"Tom"}
        //retainAll() keeps only the elements that are also in the given collection.
        namesList.retainAll(Collections.singleton("Tom")); // in this we pass that we want to retain in list
        System.out.println(namesList);

        ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14));
        ArrayList<Integer> subList=new ArrayList<Integer>(numbers1.subList(2,6));
        System.out.println(subList);


        ArrayList<String> newList=new ArrayList<>(Arrays.asList("Navven","Tom","Steve","Lisa","Navven","Tom"));
        Object []arr=newList.toArray();//ir return single dimenstion object array
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------");
        for(Object o : arr){
            System.out.println(o);

        }








    }
}
