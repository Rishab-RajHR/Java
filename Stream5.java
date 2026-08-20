import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream5 {
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(List.of(1, 13,11, 9));

         Set<Integer> list2 = list.stream()
             .map(x -> x + 1)
            .collect(Collectors.toSet());

        System.out.println(list2);
     }
}
