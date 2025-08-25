import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ExcecutorService3 {
    public static void main(String[] args) {
        ScheduledExecutorService service= Executors.newScheduledThreadPool(10);

        //task to run after 10 seconds delay
        service.schedule(new Task(),10,SECONDS);

        //task to run repeatedly every 10 seconds..
        service.scheduleAtFixedRate(new Task(),15,10,SECONDS);

        //task to run repeatedlu 10 seconds after previous task complete
        service.scheduleWithFixedDelay(new Task(),15,10,SECONDS);

    }
    static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread is :"+Thread.currentThread().getName());

        }
    }
}