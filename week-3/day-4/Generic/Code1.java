package Generic;

public class Code1<T> {
    public static void main(String[] args) {
        Box<String> box=new Box<String>("Einfochips");
        System.out.println(box.getValue());
        System.out.println(box.getValue().getClass().getName());
        box.perfromSomeTask();

        Box<Integer> box1=new Box<Integer>(12);
        System.out.println(box1.getValue());
        System.out.println(box1.getValue().getClass().getName());
        box1.perfromSomeTask();



         
    }
    
}
