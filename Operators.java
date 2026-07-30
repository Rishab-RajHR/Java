public class Operators {
    public static void main(String1[] args) {
       System.out.println("Operators in Java");
       System.out.println("Arithmetic Operators");
       int a = 4;
       int b = 2;
       int result;

       result = a + b;  // There can be - , * , /, %
       System.out.println(result);


       // Increment Operator
      //  System.out.println(++a);  // pre increment
      //  System.out.println(a++);  // post increment

       // Decrement Operator
      //  System.out.println(--a);  // pre decrement
      //  System.out.println(a--);  // post decrement

       System.out.println("Assignment Operator");
       a += b;  // a = a + b => SHorthand Property
       System.out.println(a);

       
       System.out.println("Comparison Operator");
       System.out.println(4==4);
       System.out.println(4<5);
       System.out.println(4<=4);  //true
       System.out.println(4>=8);  //false


       System.out.println("Logical Operators");
       System.out.println(4>3 && 4>2);  // And
       System.out.println(4>3 || 4<5);  // Or
       System.out.println(!(4>2));  // True
    }
}
