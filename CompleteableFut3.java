import java.util.concurrent.CompletableFuture;

public class CompleteableFut3 {
     public static void main(String[] args) {
          CompletableFuture<Void> f1 = CompletableFuture.supplyAsync(() -> 10)
          .thenRun(()  -> System.out.println("Done"));
     }
} 
