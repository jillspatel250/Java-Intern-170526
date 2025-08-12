package pack1;

public class A {
    int defaultVar = 10;        // default
    public int publicVar = 20;  // public
    protected int protectedVar = 30; // protected
    private int privateVar = 40;     // private

    public void displayFromA() {
        System.out.println("Inside A:");
        System.out.println("defaultVar: " + defaultVar);
        System.out.println("publicVar: " + publicVar);
        System.out.println("protectedVar: " + protectedVar);
        System.out.println("privateVar: " + privateVar);
    }
}
