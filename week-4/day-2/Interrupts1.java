public class Interrupts1 {
    public static void main(String[] args) {
        Thread taskThread=new Thread(new Task());
        taskThread.start();

        //some time later

        //oops,mind is changes
        taskThread.interrupt();
        System.out.println("Asking politely to stop"); //we send interrupt if that thread want to stop then they stoip otherwise work waht they work..



    }
    public static class Task implements Runnable{
        @Override
        public void run() {
            for(int i=0;i<10000 ;i++){
                //perfrom few (subset of) steps
                //processThisNumber(i);

                //check inturuption is their and if their then we stop in this
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Stopping the task");
                    return;

                }
            }
        }
    }
}