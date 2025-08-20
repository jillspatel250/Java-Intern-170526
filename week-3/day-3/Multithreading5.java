//join method 
class MyThread extends Thread {
        public void run(){
            int count=1;
            while(true){
                System.out.println(count++);
                
            }
        }       
}
public class Multithreading5
{
    public static void main(String[] args) throws Exception {
         MyThread t=new MyThread();
         t.setDaemon(true);
         t.start();
         //here we join our main method with other method 
         //wait for other method when their execution is complete till join that and then terminate 


         //NOTE:- WE CAN ACCESS MAIN THREAD USING:-
         //        Thread.currentThread();

         Thread mainThread=Thread.currentThread();
         mainThread.join();
    }
   
    
}