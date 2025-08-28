import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

//AtomicInteger
public class Adder1 {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger counter=new AtomicInteger(0);//this value will be increment by multiple threads..
        //and it is incremented by mulitple thread so we need this is thread-safe
        ExecutorService service= Executors.newFixedThreadPool(16);
        for(int i=0;i<100;i++){
            service.submit(new Task(counter));
        }
        Thread.sleep(2000);// we use that because all task need to be complete if we not write that
                                //jetla task thaya hase ej print thase and we wait for completing using Thread.sleep()
                                //we make main thread in sleep so all task is complete and then we print.. so ans is 100

        System.out.println(counter.get());

    }
    public static class Task implements Runnable{
        private final AtomicInteger counter;

        public Task(AtomicInteger counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            //some processing
            counter.incrementAndGet();

        }
    }
}
