public class exception6 {
    public static void main(String[] args) {
      // Exception Handling in chain of methods

      methodA(5, 0);
    }
    private static void methodA(int a, int b) {
       
        try {
           methodB(a, b);
        } catch (ArithmeticException e) {
          System.out.println("Division by zero is not allowed");
        }

    }

    private static void methodB(int a, int b) {
         System.out.println(a / b);
    }
}
