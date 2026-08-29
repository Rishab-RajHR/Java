public class Threadd4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while(Thread.currentThread().isInterrupted()) {
                System.out.println("Running");
            }
        });

        t1.start();

        Thread.sleep(2000);

        t1.interrupt();
    }
}

/*
   Thread  --> interrupt flag  (default true)  --> stop()

   t1.interrupt() --> Sends a signal to t1 thread that it should stop doing what its doing.

   We can gracefully handle
   --> You can make a thread run until a condition
   --> Cancelling a long running task
   --> Used to stop thread pool

   isInterrupted() --> return interupt flag value (T/F) 
   interrupted() --> return interrupt flag value (T/F) but also set it back to false
*/
