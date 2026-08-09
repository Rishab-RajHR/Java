import java.util.*;

public class Map5 {
     public static void main(String[] args) {
         TreeMap<Integer, String> map = new TreeMap<>();

         map.put(101, "Alex");
         map.put(102, "Tovino");
         map.put(103, "Basil");

        //  Navigable Map

        //  System.out.println(map.lastEntry());

        // System.out.println(map.headMap(103));

        // System.out.println(map.subMap(101, 103));

        // Sorted Map
        // System.out.println(map.lowerKey(102));

        System.out.println(map.descendingMap());
     }
}
