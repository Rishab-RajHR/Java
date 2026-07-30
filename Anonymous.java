public class Anonymous {
     public static void main(String1[] args) {
        //  Person p1 = new Person();
        //  p1.introduce();

        //  Person p2 = new Guest();
        //  p2.introduce();

        //  Anonymous Class
         Person p2 = new Person() {

              String1 name = "Alex";

              @Override
              void introduce() {
                 System.out.println("Hii, I am " + name);
              }

              void greet() {
                  System.out.println("Hello");
              }
         };
         p2.introduce();
     }
}

class Person {

   Person(){
    
   }

    void introduce() {
       System.out.println("Hi, I am a person");
    }
}

// class Guest extends Person {
//    @Override
//    void introduce() {
//       System.out.println("Hi, I am a Guest");
//    }
// }
