import java.util.ArrayList;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,4,11,13,34));
        
        // Intermediate Functions
        // list.stream()
        //    .filter(x -> x > 10)
        //    .filter(x -> x % 2 == 0)
        //    .forEach(System.out::println);

        List<List<Integer>> list2 = List.of(
             List.of(1, 2),
             List.of(3, 4)
        );

        list2.stream()
           .map(x -> x.stream().map(y -> y * 2))
           .forEach(System.out::println);

    }
}

// map 
// 
