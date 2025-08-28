import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;


public class Accumlator {
    public static void main(String[] args) throws InterruptedException {
        //in this we have more advandec versioin of LondAdder in this LongAccumulator
        //we provide Lambda expression where we do whatever operation ...
        //and from run method we set accumlator ke ketli value change thase
        //if we set accumulator 1 it means every task increment counter by +1 if we pass that sum type of lambda function
        LongAccumulator counter=new LongAccumulator((x,y)->x+y,0);
        //custom function also we pass
//        LongAccumulator counter=new LongAccumulator((x,y)->Math.max(x,y),0);

        ExecutorService service= Executors.newFixedThreadPool(16);
        for (int i=0 ; i< 100 ; i++){
            service.submit(new Task(counter));
        }
        Thread.sleep(2000);
        System.out.println(counter.get());
    }
    static class Task implements Runnable{
        private final LongAccumulator counter;

        public Task(LongAccumulator counter){
            this.counter=counter;
        }
        @Override
        public void run() {
            //some processing
            counter.accumulate(1);

        }
    }
}
