package myPack3;
import myPack2.Demo1;

class Test2 extends Demo1 {
    public void testAccess() {
        // System.out.println(a); // default -> not allowed (different package)
        // System.out.println(b); // private -> not allowed
        System.out.println(c);    // protected -> allowed (subclass even in different package)
        System.out.println(d);    // public -> allowed
    }
}
