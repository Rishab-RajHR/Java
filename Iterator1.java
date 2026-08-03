import java.util.*;

public class Iterator1 {
     public static void main(String[] args) {
      List<Integer> list = new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);

      // Collection
      Collection<Integer> c = new LinkedList<>();
      c.add(10);
      c.add(20);
      c.add(30);
      c.add(40);
      c.add(50);


      Iterator<Integer> it = list.iterator();

      while(it.hasNext()) {
          System.out.println(it.next());
      }
     }
}

// Iterable

// 10, 20, 30, 40, 50
