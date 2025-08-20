//by default every thread have default 5 priority
// max=10 and min=1
class MyThread extends Thread{
    
        public MyThread(String name){
            super(name);//thread class have constructor so we call that..
            setPriority(Thread.MIN_PRIORITY+2);
        }
        
}
public class Multithreading2
{
    public static void main(String[] args) {
         // Thread t=new Thread(new MyRun(),"My name");//if we use runnable interface so that we pass obj and name also of that thread
    MyThread t=new MyThread("First Thread");
    System.out.println(t.getName());
    // System.out.println(t.getId());
    System.out.println(t.getPriority());
    t.start();
    System.out.println(t.getState());
    System.out.println(t.isAlive());

    }
   
    
}