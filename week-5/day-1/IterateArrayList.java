import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterateArrayList {
    public static void main(String[] args) {
        ArrayList<String> studentList=new ArrayList<>();
        studentList.add("Tom"); //0
        studentList.add("Naveen"); //1
        studentList.add("Steve"); //2
        studentList.add("Lisa"); //3

        //typical for loop
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }

        System.out.println("--------------------");
        //for each loop
        for(String s:studentList){
            System.out.println(s);
        }
        System.out.println("--------------------");
        //lambda
        studentList.stream().forEach(e-> System.out.println(e));

        System.out.println("--------------------");

        //iterator
        Iterator<String> it=studentList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("--------------------");

        //list with other collection
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.println(numbers);




    }
}
