import java.util.ArrayList;
import java.util.Objects;

///virtual capcaity concept of arrayList
//initial virtual capcity of arrayList is by default 10
//inital physical capacity of arrayList is by default 0

public class VirtualCapacity {

    public static void main(String[] args) {
        ArrayList<Object> ar=new ArrayList<>();
        //if we want to change inital VC then pass in ArryList<>(20) so now VC is 20
        System.out.println(ar.size());//PC(physical capacity) =0 VC=10

        ar.add(100);
        System.out.println(ar.size());//PC is increased by 1  VC=9

        ar.add(200);
        ar.add(300);
        ar.add(400);

        System.out.println(ar.size());//PC is now 4   VC=6 remain
    }

}
