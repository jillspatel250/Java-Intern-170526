class MyThread extends Thread {
        public void run(){
            int count=1;
            while(true){
                System.out.println(count++);
            }
        }       
}
public class Multithreading4
{
    public static void main(String[] args) {
         MyThread t=new MyThread();
         t.setDaemon(true);
         t.start();
         //nothing is printed because we set thread as a demon thread
         //NOTE:- when we set daemon thread when main method is stop then with that 
         //       all the deamon thread also is stop
         //and in this program main method start thread and after that they have not anything to 
         // execiute so it will end so with that daemon ia also stop.. so nothing is print

         //if we make our main method sleep for 100ms so in that time daemon thread is runnning 
         //and after 100ms main thread is interupted and wake up then that is stop nothing is for execution 
         //so daemon thread also not printing anything
         try{
            Thread.sleep(100);
         }catch(Exception e){
            System.out.println(e);
         }
    }
   
    
}