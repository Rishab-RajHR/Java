import java.util.function.*;

public class Lambda4 {
    public static void main(String[] args) {
        
        // (x  + 2) * 3  --> x+2, x*3

        // Function<Integer, Integer> equation = x -> ((x+2) * 3);

        Function<Integer, Integer> add2 =  x -> x + 2;
        Function<Integer, Integer> multipy3 = x -> x * 3;

        int a = add2.apply(2);
        int b = multipy3.apply(a);

        System.out.println(b);
    }
}
