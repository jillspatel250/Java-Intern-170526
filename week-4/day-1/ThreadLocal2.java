//with threadLocal
//always output in stable order

class sharedData1{
    public static ThreadLocal<String> name=new ThreadLocal<>();
}
public class ThreadLocal2 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            sharedData1.name.set("jills");
            System.out.println("thread1 :- "+sharedData1.name.get());
        });

        Thread t2=new Thread(()->{
           sharedData1.name.set("einfochips");
            System.out.println("thread2 :- "+sharedData1.name.get());
        });
        t1.start();
        t2.start();
    }
}