public class Threaad2 {
     public static void main(String[] args) throws InterruptedException {
         System.out.println("Main thread starts");

         Thread t1 = new Thread(() -> {
             try {
                 Thread.sleep(2000);
             } catch (InterruptedException e) {
               System.out.println("Thread-0 starts");
             }
         });

         t1.start();

         t1.join();  // let the t1 thread first complete its execution

         System.out.println("Main thread ends");
     }
}

// join()
