import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
         Queue<Integer> queue = new ArrayDeque<>();

         // Single Ended Queue

         // enqueue
         queue.add(1);   // exception
         queue.offer(2); // false
         queue.offer(3);

         // front access
         System.out.println(queue.peek());   // return null
         System.out.println(queue.element()); // exception

         // element remove
         queue.remove();  // unsafe (throw exception)
         queue.poll();  // safer (return null)
    }
}