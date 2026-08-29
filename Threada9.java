public class Threada9 {
     public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Custom Thread running");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Custom-2 Thread running");
        });

        t1.start();
        t2.start();
        t1.setPriority(10);

        System.out.println(t1.getPriority());
     }
}

/*
    Thread Priority
     MAX_PRIORITY = 10
     MIN_PRIORITY = 1
     NORM_PRIORITY = 5
*/
