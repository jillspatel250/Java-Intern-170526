import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//we write prod consumer code using Blocking Queue
public class ProdConsumerProb1 {
    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queue=new ArrayBlockingQueue<>(10);//this handle concurrent thread access


        //producer
        final Runnable producer = () ->{
            while(true){
                try {
                    queue.put(createIterm()); //thread block if queue is full
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        new Thread(producer).start();
        new Thread(producer).start();

        //consumer
        final Runnable consumer=()->{
            while(true){
                try {
                    String i = queue.take();//thread block is queue is full
                    //process i
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        };
        new Thread(consumer).start();
        new Thread(consumer).start();
        Thread.sleep(1000);


    }

    private static String createIterm() {
        return "Understanding";
    }
}
