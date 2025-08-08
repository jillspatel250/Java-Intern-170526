//static block:- in this we initalize static variable 
//                static block run only once we make 1000 obj or 10000 obj 
//                static block run only once 


class Mobile{
    String brand;
    int price;
    static String name;

    static
    {
        name="Phone";
        System.out.println("in static block");
    }

    //construtor
    // Mobile(){
    //     brand="";
    //     price=200;
    //     System.out.println("In constuctor");
    // }

    // public void show(){
    //     System.out.println(brand + " "+price + " "+name);

    // }
}
public class Static3 {
 public static void main(String[] args) throws ClassNotFoundException {
    //  Mobile mb=new Mobile();
    //     mb.brand="Samsung";
    //     mb.price=1000;
    //     mb.name="A53";
    //     Mobile mb1=new Mobile();
    //     mb1.brand="Apple";
    //     mb1.price=1000;
    //     mb1.name="Iphone";

        //if we run only this line in main then it load class so only static block is run 
        Class.forName("Mobile");
 }    
}
