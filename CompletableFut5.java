import java.util.concurrent.CompletableFuture;

public class CompletableFut5 {
      public static void main(String[] args) {
            
        // thenComvbine()
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);

        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Void> result = f1.thenCombine(f2, (a,b) -> a + b)
        .thenAccept(result2 -> System.out.println(result2));
      }
}
