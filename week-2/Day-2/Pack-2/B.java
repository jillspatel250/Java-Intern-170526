package pack2;
import pack1.A;

public class B extends A {
    public void accessTest() {
        A obj = new A();

        System.out.println("\nAccess from different package (NOT using inheritance):");
        // System.out.println(obj.defaultVar);   //Not accessible
        System.out.println(obj.publicVar);       //public
        // System.out.println(obj.protectedVar); //protected (not via object)Not accessible
        // System.out.println(obj.privateVar);   // Not accessible

        System.out.println("\nAccess from different package (USING inheritance):");
        System.out.println(publicVar);       // public
        System.out.println(protectedVar);    // protected (via inheritance)
        // System.out.println(defaultVar);   // Not accessible
        // System.out.println(privateVar);   // Not accessible
    }

    public static void main(String[] args) {
        A a = new A();
        a.displayFromA();

        B b = new B();
        b.accessTest();
    }
}
