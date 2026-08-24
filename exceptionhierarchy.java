public class exceptionhierarchy {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try starts");
            try {
              System.out.println("Inner try starts");

              System.out.println(5 / 0); // New Arithmetic Expression

              System.out.println("Inner try ends");
              
            } catch (NullPointerException e) {
                System.out.println("Divide by zero is not allowed : Inner");
            }
            System.out.println("Outer try ends");
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero not allowed : Outer");
        }
    }
}
