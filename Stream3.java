import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(34,1,4,11,13,34,1));
        
        // Intermediate Functions
        list.stream()
           .filter(x -> x > 10)
           .map(x -> x * 2)
           .peek(System.out::println)
           .sorted((a,b) -> b-a)
           .distinct()
           .skip(1)
           .forEach(System.out::println);

        // List<List<Integer>> list2 = List.of(
        //      List.of(1, 2),
        //      List.of(3, 4)
        // );

        // list2.stream()
        //    .flatMap(x -> x.stream())
        //    .map(x -> x * 2)
        //    .forEach(System.out::println);

        Stream.iterate(1, x -> x+1)
           .limit(10)
           .skip(5)
           .forEach(System.out::println);

    }
}

// map() 
// filter()
// flatMap() --> flatening operation
// sorted() --> stateful
// distince() --> keep unique values (Hashing)
// peek() --> debugging