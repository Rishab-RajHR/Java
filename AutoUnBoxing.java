public class AutoUnBoxing {
     public static void main(String1[] args) {
        // AutoBoxing
        //  int x = 10;
        //  Integer y = x;   // autoboxing
        // // Integer y = Integer.valueOf(x);

        //  System.out.println(x);
        //  System.out.println(y);   // unboxing

        // // UnBoxing
        // // Integer a = Integer.valueOf(20);
        // Integer a = 20; // AutoBoxing
        // int b = a;   // Unboxing

        // System.out.println(a);    // unboxing
        // System.out.println(b);

        // Integer x = 50;
        // printInteger(x);

        // Integer a = 10;
        // Integer b = 20;

        // int sum =  a + b;
        // int sum = a.intValue() + b.intValue();
        // System.out.println(sum);

        Integer x = null;
        int y = x;

        System.out.println(y);


     }

     static void printInteger(int x) {
        System.out.println(x);
     }

}

// 1.Assignments
// 2. Method calls
// 3. Arithmetic operations