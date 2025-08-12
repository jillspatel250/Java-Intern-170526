//2.local inner class

//it class is local to the method(define method inside the class)


class Outer{
    void Display(){
        class Inner{
            void innerDisplay(){
                System.out.println("Hello");
            }
        }
        Inner i=new Inner();
        i.innerDisplay();
    }
}


public class Inner2 {
        public static void main(String[] args) {
            Outer o=new Outer();
            o.Display();
        }
    
}