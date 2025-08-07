// Encapsulation is a concept in object-oriented programming where the data (variables) 
// of a class is hidden from other classes and only accessible through methods
//  (getters and setters). It helps protect the internal state of an object and 
//  makes code more secure and manageable.


class Human{
   private int age=10;//this variable only access in whitin that class we not access directly in main class 
   private String name="Jills";
   public int getAge(){
    return age;
   }
   public void setAge(int a){
    age=a;
   }

   public String getName(){
    return name;
   }

   public void setName(String givenname){
    name=givenname;
   }
}

public class Encapsulation {
    public static void main(String[] args) {
        
            Human hm=new Human();
            System.out.println(hm.getAge());
            hm.setAge(101);
            System.out.println(hm.getName());
            hm.setName("patel");
    }

    
}