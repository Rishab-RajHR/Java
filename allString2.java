public class allString2 {
    public static void main(String[] args) {
        
       String s1 = new String("Alex");
       String s2 = new String("Alex");

      //  Length / Emptiness
      // System.out.println(s1.length());   // 0
      // System.out.println(s1.isEmpty());  // true
      // System.out.println(s1.isBlank());  // true

      // Character Access
      // System.out.println(s1.charAt(2));
      // char[] arr = s1.toCharArray();  // {'A', 'l', 'e', 'x'}

      // Comparison 
      // System.out.println(s1 == s2); // false
      // System.out.println(s1.equals(s2)); // true
      System.out.println(s1.equalsIgnoreCase(s2)); // true

      // Lexicographical comparison  --> Dictionary
      // System.out.println(s1.compareTo(s2)); // true

      // Searching
      System.out.println(s1.contains("ex"));  // true
      System.out.println(s1.indexOf('l'));  // 1
      System.out.println(s1.lastIndexOf("ex"));

      System.out.println(s1.startsWith("A"));

      // Extraction and Transformation
      System.out.println(s1.substring(0, 2));

      System.out.println(s1.toUpperCase());
      System.out.println(s1.toLowerCase());

      System.out.println(s1.trim());
      System.out.println(s1.strip());   // unicode friendly

      System.out.println(s1.repeat(3));
      System.out.println(s1.replace('l', 't'));

      System.out.println(s1.replaceAll("Al", "Ta"));

      // String s3 = "Alex, Basil, Tovino";
      // String[] arr = s3.split(",");

      // for(String s : arr) {
      //    System.out.println(s);
      // }

      System.out.println(String.join("-", "a", "b", "c"));

      // Conversion
      String s4 = new String(String.valueOf(10));

      byte[] arr = s1.getBytes();
      for(byte i : arr) {
          System.out.println(i + " , ");
      }

      // Advance --> intern(), format()
      String s5 = new String("Hello");
      String s6 = s5.intern();

      System.out.println(s5 == s6);

      // Format
      String name = "Tovino";
      int age = 23;

      // Hello Tovino, Your age is 34;

      // System.out.println("Hello" + " " + name + "," + " " + "Your Age is" + " " + age);
      System.out.println(String.format("Hello %s, Your age is %s", name, age));

    }
}

// equals() --> == --> References compare
// compareTo()  --> -ve, 0, +ve

// Substring --> [, )

/*
String pool : "Hello"
Heap: s5 --> "Hello"  <-- s6
Heap: 
*/