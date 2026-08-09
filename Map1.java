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

      //    System.out.println(map.containsKey(102));
      //    System.out.println(map.containsValue("Alex"));

      //    System.out.println(map.put(104, "Abhay"));
      // System.out.println(map.get(103));

      // map.remove(101);

      // Map<Integer, String> map2 = new HashMap<>();

      // map.putAll(map2);

      //  map.clear();

      //  Set<Integer> set = map.keySet();
      //  System.out.println(set);

      // Collection<String> c = map.values();
      // System.out.println(c);

      // Set<Map.Entry<Integer, String>> entries = map.entrySet();
      // System.out.println(entries);

      //  System.out.println(map.getOrDefault(102,"Unknown"));

      // System.out.println(map.putIfAbsent(103, "Allu"));

      //  map.remove(102, "Tovino");

      // map.replace(101, "Sonu");

      // map.replace(101, "Alex", "Sonu");

      // Set<Map.Entry<Integer, String>> entries = map.entrySet();

      //  for(Map.Entry<Integer, String> entry : entries) {
      //          Integer key = entry.getKey();
      //          String value = entry.getValue();

      //          System.out.println(key + " , " + value);
      //  }


      Map<Integer, String> map2 = Map.of(101, "Alex", 102, "Tovino");
      map2.put(103, "Rohan");


      }
}
