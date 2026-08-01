public class GenericMethods {
     public static void main(String[] args) {
        //  String  y =  getResult("Hello");
        //  System.out.println(y);

        printPair(12, "Alex");  // TypeInference
     }
     public static <T> T getResult(T x) {  // <T> Type Parameter
        return x;
     }

     public static <T,U> void printPair(T first, U second) {
        System.out.println(first + " , " + second);
     }
}

// Generic Methods
// <T> returnType methodname(R parameter) {
// }