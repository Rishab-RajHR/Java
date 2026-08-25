public class exceptionhierarchy6 {
     public static void main(String[] args) {
          checkEligibility(19);
     }
     private static void checkEligibility(int age) {
        if(age <= 0) {
           System.out.println("Age cannot be negative");
        }

        if(age > 18) {
           System.out.println("You are eligible to vote");
        }
     }
}
