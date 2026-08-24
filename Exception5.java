public class Exception5 {
     public static void main(String[] args) {
         // Exception Handling

         System.out.println("Step 1");

         try {
           int a = 5;
           int b = 0;

           System.out.println(a / b);  // illegal statement
         } 
         catch (ArithmeticException e) {
             System.out.println("Division by zero is not allowed");
         }

        System.out.println("Step 2");
     }
}
