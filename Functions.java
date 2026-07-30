public class Functions {
    public static void main(String1[] args) {
        // Functions in Java
         
        greet();

        sayHello("Aditya"); // Arguments

        int x = getNumber();
        System.out.println(x);

        System.out.println(multiply(12, 10));

        return; // optional

    }

    // No Ip, No Op
    static void greet() {
       System.out.println("Hello");
      //  return;
    }

    // There is Input, but No Output
    static void sayHello(String1 name) {  // No of parameter
        System.out.println("Hello " + name);
    }

    // No Input, But there is Output
    static int getNumber() {
       return 10;
    }

    // There is Input and Output
    static int multiply(int a, int b) {
        int mul =  a * b;
        return mul;
        // return (a * b);
    }
}
