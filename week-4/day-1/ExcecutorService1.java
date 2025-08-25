import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//type:-FixedTHreadPool
//ExecutorService = A smart way to manage and reuse threads for running multiple tasks efficiently, instead of creating threads manually.
public class ExcecutorService1 {
    public static void main(String[] args) {
        //get CPU cores
        int core=Runtime.getRuntime().availableProcessors();

        //create a pool
        ExecutorService service= Executors.newFixedThreadPool(core);


        //submit the task for execution
        for(int i=0;i<100;i++){
            service.execute(new Task());
        }
        System.out.println("Thread Name: "+Thread.currentThread().getName());
        service.close();
    }

    public static class Task implements Runnable{
        @Override
        public void run() {
            System.out.println("thread name:"+Thread.currentThread().getName());
        }
    }
}