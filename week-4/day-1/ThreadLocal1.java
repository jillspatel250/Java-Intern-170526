//without threadLocal

class sharedData{
    public static String name;
}
public class ThreadLocal1 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            sharedData.name="Jills";
            System.out.println("thread1 :- "+sharedData.name);
        });

        Thread t2=new Thread(()->{
            sharedData.name="einfochips";
            System.out.println("thread2 :- "+sharedData.name);
        });
        t1.start();
        t2.start();
    }
}

//in this value and order both is change like this
/*thread2 :- einfochips
thread1 :- Jills

thread1 :- einfochips
thread2 :- einfochips

but if we use threadClass then value is same always only order might change some time one threat run first some time second thread run first
because if we use ThreadLocal class then each thread have their own copy of that variable
 */