import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        //arrayList behave like dynamic array
        ArrayList<Object> ar=new ArrayList<>();
        ar.add(100); //store on 0th index
        ar.add(200); //store on 1st index
        ar.add("testing"); //store on 2nd index
        ar.add(12.33); //store on 3rd..
        ar.add('t');
        ar.add(true);
        System.out.println(ar);

        System.out.println(ar.get(1));
        //System.out.println(ar.get(192)); //thorw indexoutofboundexeption

        System.out.println(ar.size());

        ar.add(89);
        ar.add("jills");

        System.out.println(ar.size());

    }



}
