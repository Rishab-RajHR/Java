import java.util.concurrent.CompletableFuture;

public class CompletableFut4 {
     public static void main(String[] args) {
          CompletableFuture<Void> f1 = CompletableFuture.supplyAsync(() -> 10)
          .thenAccept(result -> System.out.println(result));
     }
}
