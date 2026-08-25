// public class execeptionhierarchy11 {
//      public static void main(String[] args) {
//          try {
//             checkEligibility(-5);
//          }
//         catch(InvalidAgeException e) {
//               System.out.println(e.getMessage());
//               System.out.println("Entered Age was " + e.getAge());
//          }
//      }
//      private static void checkEligibility(int age) throws InvalidAgeException {
//          if(age <= 0) {
//              throw new IllegalArgumentException("Age Cannot be negative", age);
//          }

//          if(age > 18) {
//             System.out.println("You are eligible to vote");
//          }
//      }
// }

// class InvalidAgeException extends Exception {

//        private int age;     

//        public InvalidAgeException(String message, int age) {
//             super(message);
//             this.age = age;
//        }

//        public int getAge() {
//           return this.age;
//        }
// }
