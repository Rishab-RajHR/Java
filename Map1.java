import java.util.*;

public class Map1 {
      public static void main(String[] args) {
         // Roll No, names
         Map<Integer, String> map = new HashMap<>();
         map.put(101, "Alex");
         map.put(102, "Tovino");
         map.put(103, "Shrikanth");

         map.size();
         map.isEmpty();

         System.out.println(map.containsKey(102));
         System.out.println(map.containsValue("Alex"));
      }
}
