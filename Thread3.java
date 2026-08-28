public class Thread3 {
     public static void main(String[] args) {
          Thread t1 = new Thread(() -> System.out.println("Thread is Running"));

          t1.start();
     }
}
