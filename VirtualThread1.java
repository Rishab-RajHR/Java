import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread1 {
     public static void main(String[] args) {
          // Thread t1 = Thread.startVirtualThread(() -> {
          //     System.out.println(Thread.currentThread() + " says hello");
          // });

          ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor();

          for(int i=1; i<=5; i++) {
              executor.submit(() -> {
                  System.out.println("Task executed by " + Thread.currentThread());
              });
          }

          // try {
          //    Thread.sleep(3000);
          // } catch (Exception e) {}
         
          executor.shutdown();
     }
}
