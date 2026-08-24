public class exception8 {
    public static void main(String[] args) {
        // Exception Handling

        System.out.println("Step 1");

     

        try {
           int a = 5;
           int b = 0;

           System.out.println(a / b); // illegal --> new ArithmeticException("/ by zero")

           // risky code
          
        } catch (ArithmeticException e) {
          //  System.out.println(e.getMessage());
          System.out.println("Division by zero is not allowed");

          // Preventive / handling code
        } catch (NullPointerException e) {
          //  System.out.println(e.getMessage());
          System.out.println("Division by zero is not allowed");

          // Preventive / handling code
        }
         finally {
             // This always runs
             System.out.println("Heyy");

             // cleanup code (optional)

         }

        System.out.println("Step 2");
    }
}
