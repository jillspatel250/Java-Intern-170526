//class inside a class called inner class
//type of inner class:-
//1.nested inner class
//2.local inner class
//3.Anonymous inner class
//4.static inner class


//1.nested inner class
class Outer{
    int x=10;
    class Inner{
        int y=20;
        public void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    public void outerDisplay(){
        Inner i=new Inner();
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class Inner1 {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();
        //direct we not make object of inner class we need to make first outer class
        Outer.Inner i=new Outer().new Inner();
        i.innerDisplay();
    }
    
}
