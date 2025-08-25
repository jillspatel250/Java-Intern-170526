//type:-CachedThreadPool

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorService2 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
            service.submit(()->{
                System.out.println("Thread name is :" + Thread.currentThread().getName());
            });
        }
    }
}