//now we want 1000 user for this service
//SO in this case impractical to create 1000 thread and start all of that in same time and if we do that then memory and time is too much consume
//So in that case we use threadPool() in that we pass whatever value etli size no pool bani jase
//we make threadpool and make global df object so it created only one time and use multiple time so no need to create each time differenrt df object

import java.text.SimpleDateFormat;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class UserService3 {

    private static ExecutorService threadPool= Executors.newFixedThreadPool(10);
    private static SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-DD");

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<1000;i++){
            int id=i;
            threadPool.submit(()->{
                String biirthDate=new UserService3().birthDate(id);
                System.out.println(biirthDate);
            });
        }
        Thread.sleep(1000);

    }
    public String birthDate(int userId){
        //this is all for understanding purpose
        // Date birthDate=birthDate(int id);
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        // return df.format(birthDate);
        return "s";
    }
}