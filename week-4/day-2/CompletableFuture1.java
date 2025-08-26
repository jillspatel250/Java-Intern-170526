import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFuture1 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(10);
        try {

            /*
            this is commene becuae this is for concept learning purpose
            Future<Order> future=service.submit(getOrderTask());
            Order order=future.get(); //bloking(jya sudho future aa placeholder ma kasu na aai jay tya sudhi aa line per j code rehse)

            Future<Order> future1=service.submit(enrichTask(Order));
            order= future.get();//bloking

            Future<Order> future2=service.submit(performPaymentTask(Order));
            order= future.get();//blocking

            Future<Order> future3=service.submit(dispatchTask(Order));
            order= future.get();//blocking

            Future<Order> future4=service.submit(sendEmailTask(Order));
            order= future.get();//blocking

             */

        }catch (Exception e){
            e.printStackTrace();
        }
        //make callable interface
    }
}