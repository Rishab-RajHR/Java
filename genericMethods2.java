public class genericMethods2 {
     public static void  main(String[] args) {
         Box<Integer> b1 = new Box<>();   
         b1.value = 5;
         b1.printDouble();
       }
} 


// Bounds in Generics: In Java, generics can have bounds that restrict the types that can be used as type parameters. There are two types of bounds: upper bounds and lower bounds.

// Upper Bounds: An upper bound restricts the type parameter to be a subtype of a specified class or interface. This is done using the extends keyword. For example, if you want to create a generic method that can accept any type that is a subclass of Number, you can use an upper bound like this:

class Box<T extends Number> {
    T value;

    public void printDouble() {
        System.out.println(value);
    }
}