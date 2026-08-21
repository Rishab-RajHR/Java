import java.util.Optional;

public class OptionalTransformer {
      public static void main(String[] args) {
            // Optional<User> user = getUser();

            // if(user != null){
            //      Address address = user.address;

            //      if(address != null) {
            //         String city = address.city;

            //         if(city != null){
            //             System.out.println(city);
            //         }
            //      }
            // }

            // user.flatMap(x -> x.address)
            // .map(y -> y.city)
            // .ifPresent(System.out::println);

            // Optional<Optional<Address>> address = user.map(x -> x.address);  // Optional<Optional<Address>>

            // Optional<String> name = Optional.of("Alex");

            // Optional<String> result = name.filter(x -> x.length() > 2);

            // System.out.println(result.orElse("Empty"));

             Optional<String> name = Optional.of("Alex");

             name.map(x -> x.length())
                 .filter(len -> len > 3)
                 .ifPresent(System.out::println);

      }

      private  static Optional<User> getUser(){
         Address a = new Address();
         a.city = "Delhi";

         User u = new User();
         u.address = Optional.of(a);

         return Optional.of(u);
      }
}

class User {
    public Optional<Address> address;
}

class Address {
    public String city;
}


// map() -> function ( T -> R) [If value is present then apply the map, and return optional]
// flatMap()
// filter() -> Check a condition , if true keep the value else do nothing

// Streams() --> [user1, user2, user3, ...]
// Optional --> [User]