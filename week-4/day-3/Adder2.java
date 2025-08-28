import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

//AtomicLong
//this is work differently LongAdder has a sperateCounter for each thread
//example:- counter=0 so that have counter'=0 for sepeataeCounter so aa rete badha jode alag alag counter...
//          and all are sync during sum methods.. image:-LongAdder

public class Adder2{
    public static void main(String[] args) throws InterruptedException {
        LongAdder counter=new LongAdder();
        ExecutorService service=Executors.newFixedThreadPool(16);
        for(int i=0;i<100;i++){
            service.submit(new Task(counter));
        }
        Thread.sleep(2000);
        System.out.println(counter.sum());//all task synachronized across all threads..
    }
    public static class Task implements Runnable{
        private final LongAdder counter;

        public Task(LongAdder counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            //some processing
            counter.increment();

        }
    }
}
