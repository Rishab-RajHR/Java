public class Exception5 {
     public static void main(String[] args) {
         // Exception Handling
         try {
           int a = 5;
           int b = 0;

           System.out.println(a / b);
         } catch (ArithmeticException e) {
             System.out.println("Division by zero is not allowed");
         }
     }
}
