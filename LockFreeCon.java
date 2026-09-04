import java.util.concurrent.atomic.AtomicReference;

public class LockFreeCon {
     public static void main(String[] args) {
        LikeCounter likeCounter = new LikeCounter();

        Thread t1 = new Thread(() -> likeCounter.like());
        Thread t2 = new Thread(() -> likeCounter.like());
        Thread t3 = new Thread(() -> likeCounter.like());
        Thread t4 = new Thread(() -> likeCounter.like());
        Thread t5 = new Thread(() -> likeCounter.like());
        Thread t6 = new Thread(() -> likeCounter.like());
        Thread t7 = new Thread(() -> likeCounter.like());
        Thread t8 = new Thread(() -> likeCounter.like());
        Thread t9 = new Thread(() -> likeCounter.like());
        Thread t10 = new Thread(() -> likeCounter.like());
         

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();

        // try {
        //   Thread.sleep(3000);
        // } catch (Exception e) {
        //   // TODO: handle exception
        // }

        System.out.println("Total likes "+ likeCounter.getTotalLikes());
     }
}

class LikeCounter {
   
     AtomicReference<Integer> totalCount = new AtomicReference<>(0);

     public void like() {
        while(true) {

           Integer currentCount;
           Integer finalCount;
             
            // 1. We will capture the latest value of totalCount;
            currentCount = totalCount.get();

            // 2. Increment like counter by 1
            finalCount = currentCount + 1;

            // 3. Check again, if the count is still whay I saw.
            if(totalCount.compareAndSet(currentCount, finalCount)) {
                return;
            }

            // 4. If a thread reaches here, someone else must have updated the resource
            // Re-try
            System.out.println("Conflit detected. Re-trying...");
        }
     }

     public int getTotalLikes() {
       return totalCount.get();
     }
}
