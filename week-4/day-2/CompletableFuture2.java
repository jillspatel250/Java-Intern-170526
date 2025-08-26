import java.util.concurrent.CompletableFuture;

public class CompletableFuture2 {
    public static void main(String[] args) {
        /*
        in this after (()-. getOrder,....) in space of ... we pass our own thread pool if we use .thenApplyAsync() then JVM ema thi thread laine run karse...
        CompletableFuture.supplyAsync(()-> getOrder())
                .thenApply(order -> enrich(order))
                .thenApply(order -> performPayment(order))
                .execptionally(e -> new FiledOrder()) //uper na 3 mathi koi pan method fail jay toh j aa call thase work like catch block
                .thenApply(order -> dispatch(order))
                .thenAccept(order -> sendEmail(order))

         */
    }
}