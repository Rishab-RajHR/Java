import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Stream4 {
     public static void main(String[] args) {
         // Terminal Operations

         List<Integer> list = new ArrayList<>(List.of(1, 13,11, 9));

        //  List<Integer> list2 = list.stream()
        //      .map(x -> x + 1)
        //      .collect(Collectors.toList());

        //      System.out.println(list2);

        // Optional<Integer> sum = list.stream()
        //    .reduce((a,b) -> a + b);

        //    System.out.println(sum.get());

       OptionalDouble avg= list.stream()
            .filter(x -> x > 10)
            .mapToInt(x -> x)
            .average();

        System.out.println(avg.getAsDouble());
     }
}

// forEach() , forEachOrdered()
// toList()
// collect()  --> collector
// Collector --> Collectors
// reduce() --> Combine stream values into single value
// findFirst()