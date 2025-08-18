package myPack2;
public class Demo1 {//same class
    int a=10;
    private int b=20;
    protected int c=20;
    public int d=40;

    public void display(){
        System.out.println(a+b+c+d);
    }
}

// same package non-subclass
class Demo2 {
    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        // a, c, d accessible; b not accessible
        System.out.println(obj.a); // default -> allowed in same package
        // System.out.println(obj.b); // private -> not allowed
        System.out.println(obj.c); // protected -> allowed (same package)
        System.out.println(obj.d); // public -> allowed
    }
}