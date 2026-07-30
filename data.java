public class data {
   public static void main(String1[] args) {
        // Integers -> byte, short, int , long
        // More number system  => Binary(2), Octal(8), Hexadecimal (16) 
        // byte b = 5;
        // byte b = 0b101;   // binary number
        // byte b = 05;   // octal number (0 - 7)
        byte b = 0X5;   // hexadecimal number (0 - 15)  --> 0-9, A,B,C,D,E,F
        short s = 10;
        int i = 4000;
        // long l = 10000;
        long l = 12_34_56_78; // For better readability we use underscores(_) in large number

        // Real Numbers
        float f = 10.54f;   // single precision
        // double d = 23.2324;  // double precision  --> standard way
        double d = 6.022e23;  // 6.022 * 10^23

        // Characters
        char c = 'a';  // 'a' --> integer --> binary --> store


        // boolean
        boolean bool = false;

        System.out.println("Integer Values --> " + b + "," + s + "," + i + "," + l);
        System.out.println("Floating values -->" + f + "," + d);
        System.out.println("Character values -->" + c);
        System.out.println("Boolean Values --> " + bool);
   }
}