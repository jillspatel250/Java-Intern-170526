//4.static innner class
//static inner class have static member of outer classes

class Outer{
    static int x=10;
    static int y=20;
    

    static class Inner {
        static int p=20;
        void display(){

            System.out.println(x);
            System.out.println(y);
        }
    }
}

public class Inner4 {
    public static void main(String[] args) {
        //inner class is static so we not make outer class object
        //Outer().Inner(); not like that we make only Inner() Object
        Outer.Inner i=new Outer.Inner();
        i.display();
    }
}