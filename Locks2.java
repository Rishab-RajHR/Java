public class Locks2 {
    public static void main(String[] args) {

        Test test = new Test();

        Thread t1 = new Thread(() -> test.show());

        Thread t2 = new Thread(() -> test.show());

        t1.start();
        t2.start();
    }
}

class Test {
    
    void show() {
        System.out.println(Thread.currentThread().getName() + "Inside Show");

        // try {
        //   Thread.sleep(2000);
        // } catch (Exception e) {}

        System.out.println(Thread.currentThread().getName() + "Show Finish");
    }
}
