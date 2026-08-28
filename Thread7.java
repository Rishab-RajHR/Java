public class Thread7 {
       public static void main(String[] args) {
           // Thread new stage

           Thread mainThread = Thread.currentThread();

           Thread t1 = new Thread(() -> {
               System.out.println("Name of current thread is " + Thread.currentThread().getName());
               System.out.println("Main thread state " + Thread.currentThread().getName());
           });

           System.out.println(t1.getState());

           // Runnable stage
           t1.start();
           System.out.println(t1.getState()); // RUNNABLE, TERMINATED

          // try {
          //   System.out.println(Thread.currentThread().getState());
          //      Thread.sleep(2000);
          // } catch (Exception e) {}

          System.out.println(t1.getState());  // TERMINATED
       }
}

// Thread Lifecycle
