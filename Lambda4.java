import java.util.function.*;

public class Lambda4 {
    public static void main(String[] args) {
        
        // (x  + 2) * 3  --> x+2, x*3

        // Function<Integer, Integer> equation = x -> ((x+2) * 3);

        Function<Integer, Integer> add2 =  x -> x + 2;  // f(x)
        Function<Integer, Integer> multipy3 = x -> x * 3; // g(x)

        // int a = add2.apply(2);
        // int b = multipy3.apply(a);

        int ans = multipy3.apply(add2.apply(2));
        // g(f(x))

        int ans2 = add2.andThen(multipy3).apply(2);

        Function<Integer, Integer> ansFunc = add2.andThen(multipy3);
        int ans3 = ansFunc.apply(2);

        System.out.println(ans3);

        System.out.println(ans);
    }
}
