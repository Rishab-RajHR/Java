public class exceptionhierarchy8 {
      public static void main(String[] args) {
          checkEligibility(-5);
      }
      private static void checkEligibility(int age) {
          try {
             if(age <= 0) {
             throw new IllegalArgumentException("Age cannot be negative");
             }

             if(age > 18) {
              System.out.println("You are eligible to vote");
             }
           } catch (IllegalArgumentException e) {
              System.out.println(e.getMessage());
          }
      }
}
