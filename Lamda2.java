
import java.util.function.*;

public class Lamda2 {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x -> x * x;

        System.out.println(square.apply(5));

        Consumer<Integer> print = x ->  System.out.println(x);
    }
}
