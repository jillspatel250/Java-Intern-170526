import java.util.Vector;

//Vectors of Vector is called 2D Vector
public class Vector2D {
    public static void main(String[] args) {
        Vector<String> langVector=new Vector<>();
        langVector.add("Java");
        langVector.add("Python");
        langVector.add("Ruby");
        langVector.add("JavaScript");
        langVector.add("C#");

        Vector osVector=new Vector();
        osVector.add(langVector);//here vector of vector is created .. one vectore inside another vector

        for (int i=0;i<langVector.size();i++){
            String str=(String)((Vector)osVector.get(0)).get(i);
            System.out.println(str);
        }
        //osVector.get(0) using this vector we access inside je vecotoe hase a and then we apply .get()
        //to aceess under na vector na element ne access karva









    }
}
