interface Test
{
    int X=10;
    void meth1();
    void meth2();
    // public static void meth3(){
    //     System.out.println("Meth3 of test");
    // }
    default void meth3(){//if we make that is default method so we not override in test2 this no give any error 
        System.out.println("Meth3 of test");
    }
}
interface Test2 extends Test
{
   void meth4();
}
class My implements Test2{
    public void meth1(){ }
     public void meth2(){ }
     public void meth4(){ }
}
public class Interface4 {
    public static void main(String[] args) {
        System.out.println(Test.X);
        My m=new My();
        m.meth3();//we call that interface method using class object...
    }
    
}