public class Type {
      public static void main(String[] args) {
          // 1.  Implicit Conversion (Automatically converts the datatype)
          // (byte to int)
          // byte b = 24;
          // int i;

          // i = b;
          // System.out.println(i);  // 24


          // character to int
        //   char c = 'a';
        //   int i;

        //   i = c;

        //  System.out.println(i);   // 97




        // 2. Explicit Conversion (Do Typecasting)
        // int i = 300;
        // byte b; // -128 to +127

        // b = (byte) i;
        // System.out.println(b); // 300 % 256 = 44




        // 3. Truncating the conversion
        // float f = 15.678f;
        // int i;

        // i = (int) f;
        // System.out.println(i);  // 15



        //  Boolean to any data type
        // These conversions are not possible

        // boolean bool = false;
        // int i;

        // i = bool;



        // Automatic Type Conversion

        // byte b = 50;
        // b = (byte) (b * 2);  // 100

        // System.out.println(b);
         



        // Type Promotion Conversion

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        double result = (f * b) + (i /  c) - (d * s);

        // f * b --> float
        // i / c --> integer
        // d * s --> double

        // float + integer -->  float - double --> double

        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("result = " + result);
      }
}
