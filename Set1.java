import java.util.*;

public class Set1 {
    public static void main(String[] args) {
       Set<String> set = new HashSet<>();

       set.add("Alex");
       set.add("Tillu");
       set.add("Basil");

       System.out.println(set.contains("Alex"));

      //  Map Method
      Map <Integer, String> map = new HashMap<>();
      map.put(101, "Alex");
      map.put(102,  "Rohan");
      map.put(103, "Aditya");

      System.out.println(map.containsKey(101));
      System.out.println(map.get(102));
    }
}
