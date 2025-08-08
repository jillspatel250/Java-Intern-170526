//super() means call the constructor of super class 
class A{
 public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    //every constrcutor have in build super() ...
    public B(){
        System.out.println("in B");
    }
    public B(int n){
        super(n);
        System.out.println("in B int");
    }
}


public class Super {
    public static void main(String[] args) {
        A obj=new B(10);
    }
}