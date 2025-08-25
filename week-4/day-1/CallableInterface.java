import java.util.Random;
import java.util.concurrent.*;


public class CallableInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(10);

        for (int i=0;i<100;i++){

            //Future is a placeholder for the value which arrive sometime in future...
        Future<Integer> future= service.submit(new Task());
            System.out.println("Thread Name:"+Thread.currentThread().getName());
            Integer res=future.get();//blocking statement this block main thread
            System.out.println(res);

        }
    }
    public static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }
}