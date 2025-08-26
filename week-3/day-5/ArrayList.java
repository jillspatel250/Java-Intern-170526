import java.util.*;
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> al1=new ArrayList<>(20);

        ArrayList<Integer> al2=new ArrayList<>(List.of(15,25,35,45));

        al1.add(10);
        al1.add(20);
        al1.addAll(1,al2);
        System.out.println(al1);
        System.out.println(al2);


        System.out.println(al1.contains(15));
        System.out.println(al1.get(1));
        System.out.println(al1.indexOf(20));

        al1.set(3,1000);//go to index 3 and replace value with 1000

        //we can access list element using 2 approch
        //1 using for loop
        //2 using iterator
        //3 using for each loop
        //4 using lambda operation

        //for loop (this is generic class so we cannot acces like al1[i] this is use
        // for array only so we need to use .get() to access element)
       /* for(int i=0;i<al1.size();i++){
            System.out.println(al1.get(i));
        }

        //        Iterator<Integer> it=al2.iterator();
        //        while (it.hasNext()){
        //            System.out.println(it.next());
        //        }

        for(Integer x:al1){
            System.out.println(x);
        }

        al1.forEach((x)->{
           System.out.println(x);
        })

        */
    }



}