//this is a keyword that calling the current object .
// current obj means that object that calling the method 

class Human{
   private int age=10;
   private String name="Jills";

   public int getAge(){
    return age;
   }
   public void setAge(int age){
    this.age=age;
    //instance variable = local variable 

    //one other option is using object 
    //Human obj1=obj;obj is passed from main in setAge(int age , obj)
    //main function:-call setAge
    //Human obj=new Human()
    //obj.setAge(20,obj);//this is not good syntax call usinf obj and passed obj 
    //obj1.age=age; this is the not good way 

    //so this is a keyword that refer current object so thats why we use this 
    //so simply we use this keyword

   }

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name=name;
   }
}

public class ThisKeyword {
    public static void main(String[] args) {
            Human hm=new Human();
            System.out.println(hm.getAge());
            hm.setAge(101);
            System.out.println(hm.getName());
            hm.setName("patel");
    }

    
}