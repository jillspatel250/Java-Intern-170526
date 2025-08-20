class MyThread extends Thread {
    
        public MyThread(String name){
            super(name);
            setPriority(Thread.MIN_PRIORITY+2);
        }
        public void run(){
            int count=1;
            while(true){
                System.out.println(count++);
                try{
                Thread.sleep(100);
                }catch(InterruptedException e){
                    System.out.println("Interrupted exception"+e);
                }
            }
        }       
}
public class Multithreading3
{
    public static void main(String[] args) {
         MyThread t=new MyThread("My thread 1");
         t.start();
         //we interrupt that thread after starting
         t.interrupt();

    }
   
    
}