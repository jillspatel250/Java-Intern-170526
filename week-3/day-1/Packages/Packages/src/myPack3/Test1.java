package myPack3;
import myPack2.Demo1;

public class Test1 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();

        // System.out.println(obj.a); // default -> not allowed
        // System.out.println(obj.b); // private -> not allowed
        // System.out.println(obj.c); // protected -> not allowed (because not subclass and different package)
        System.out.println(obj.d);  // public -> allowed
    }
}
