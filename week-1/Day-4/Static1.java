//static variable use in static method and non-static method 

class Mobile{
    String brand;//instance varaible 
    int price;
    static String name;//we need common name for the all the object 
    public void show(){
        int a=10;//local variable
        System.out.println(brand+":"+price+":"+name);
    }

}
public class Static1{
    public static void main(String[] args) {
        
        Mobile mb=new Mobile();
        mb.brand="Samsung";
        mb.price=1000;
        mb.name="A53";
        mb.show();
        Mobile mb1=new Mobile();
        mb1.brand="Apple";
        mb1.price=1000;
        mb1.name="Iphone";
        mb1.show();

        
        mb1.name="Helllloooo";//now if we change in one object it chnage in all the 
        //objects so that is use of static
        mb.show();
        mb1.show();

        //we can call static variable using object and and also class name 
        System.out.println("static variable call using object:- " + mb.name);
        System.out.println("static variable call using class:-  "  + Mobile.name);
    
    }
    
}