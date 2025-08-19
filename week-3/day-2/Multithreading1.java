//without multithreading 
//volatile problem:-
//synchronization problem:-

class Test{
   public static void display()
    {
        int i=1;
        while(true){
            System.out.println(i+"Hello");
            i++;
        }
    }
}

public class Multithreading1 {
    public static void main(String[] edewfr) {
        Test.display();//in this infinite loop so after this what we write that is never execture

        //this is never execute
        int u=1;
        while(true){
            System.out.println(u+"world");
            u++;
        }
    }

 
    
}