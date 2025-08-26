import java.util.concurrent.Callable;

public class Interrupts2 {
    public static void main(String[] args) {
        /*
        Thread taskThread=new Thread(new Task());
        taskThread.start();

        //some time later

        //oops,mind is changes
        taskThread.interrupt();
        System.out.println("Asking politely to stop"); //we send interrupt if that thread want to stop then they stoip otherwise work waht they work..

*/

    }

//    public static class Task implements Runnable{
//        @Override
//        public void run() {
//            for(int i=0;i<10000 ;i++){
//                //perfrom few (subset of) steps
//                //processThisNumber(i);
//
//                if(Thread.currentThread().isInterrupted()){
//                   //throw new InterruptedException();//this gives error becuase runnable does not allow checked exceptions
//                                                    // so if we want to throw checked exception then we need to use Callable interface
//
//                }
//            }
//        }
//    }



    public static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws InterruptedException {
            for(int i=0;i<10000 ;i++){
                //perfrom few (subset of) steps
                //processThisNumber(i);

                if(Thread.currentThread().isInterrupted()){
                    throw new InterruptedException();
                    //InterruptedException is a mechanisam for letting a thread know who send interrupt() so InterruptedException said
                    //that interrupt is accpeted and we stop doing further work...

                }
            }
            return null;
        }
    }
}