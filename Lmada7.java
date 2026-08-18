import java.util.function.*;

public class Lmada7 {
     public static void main(String[] args) {
         Consumer<String>  printName = System.out::println;
         Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());

         Consumer<String> pipeline = printName.andThen(printUpperCase);

         pipeline.accept("Alex");
     }
}
