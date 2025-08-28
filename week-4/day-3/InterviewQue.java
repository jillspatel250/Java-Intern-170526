//question:-A task is running in a separate thread. Stop the task if excceeds 10 min.
//Approch:- 1st step how to stop the thread/task
//          2nd Timeout Conditions

//can we stop a thread?? No theri is not available method to kill or stop thread
/*1st approch:- using callble and future .. future have cancel methoids but it not guranntes that stop thread it try
                NOTE:-java thread cannot be killed they are cooperative .. you need to ask politely..
                how to ask politely:-
                1.Interrupts
                2.Volatile/AtomicBoolean
  //1.start the task
  Future
 */

//solve using Interruptes

public class InterviewQue {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            //step 1
            //step 2
            if(Thread.currentThread().isInterrupted()){
                System.out.println("Stopping task as requested");
                return;
            }

            //step 3
            //step 4
        });

        //2. TODO: timeout for 10 minutes

        //3. Stop the thread
        t1.interrupt();
    }
}
