abstract class Car{
    public abstract void  drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play music");
    }
}

//if our wagonar class not able to implement all the methods then we make that as a abstract class
//and that class ne je extends karse ene e method implement karvi padse
abstract class wagonaR extends Car{
    public void drive(){
        System.out.println("Driving..");
    }
    // public void fly(){
    //     System.out.println("Flying...");
    // }
}

class updatedWagonaR extends wagonaR{
    public void fly(){
        System.out.println("Flying");


    }
}




public class Abstract {
 public static void main(String[] args) {

    //abstract class we cannnot make object so we make referece of that here we use dynamic method dispatch
    Car obj=new updatedWagonaR();
    obj.playMusic();
    obj.drive();
    obj.fly();
    
 }    
}