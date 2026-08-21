import java.util.Optional;

public class Optional2 {
     public static void main(String[] args) {
         Optional<String> name = getName();

        //  System.out.println(name.orElse("Unknown"));

        // System.out.println(name.orElseGet(() -> "Unknown"));

        // System.out.println(name.orElseThrow(null));

        name.ifPresentOrElse(System.out::println, () -> System.out.println("Unknown"));
     }

     public static Optional<String> getName() {
        return Optional.ofNullable("Alex");
     }
}
