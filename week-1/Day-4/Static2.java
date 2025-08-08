//static method :- static method access using that class object and 
//                 static method access using that class name 
//WE CANNOT USE NON VARIABLE IN-SIDE STATIC VARIABLE
class Mobile{
    String brand;
    int price;
    static String name="einfochops";
    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }

    public static void show1(){
        System.out.println("print static method"+ name);
        //in this we not use brand and price 
        //if we need to do than we need to give object in method 
    }

    public static void show2(Mobile obj){
        System.out.println(name +" " +obj.brand +" "+ obj.price);
    }

}
public class Static2{
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

        //Mobile.show();// this give error non-static method cannot access using classname
        Mobile.show1();

        Mobile.show2(mb1);//passing object we can use non-static variable inside static method


       

    }
    
}