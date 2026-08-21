import java.util.Optional;

public class optional {
     public static void main(String[] args) {
         Optional<String> name = getName();

        //  if(name.isPresent()){
        //      System.out.println(name.get());
        //  }

        name.ifPresent(System.out::println);
     }

     public static Optional<String> getName() {
        // return Optional.empty(); 
        // return Optional.of("Alex"); 
        return Optional.ofNullable(null);
     }
}
