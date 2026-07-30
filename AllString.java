public class AllString {
    public static void main(String[] args) {
       String s1 = new String("");

       String s2 = new String("Hello");

       String s3 = "Alex";
       String s4 = new String(s3);

      //  System.out.println(s2);

      // char array
      char[] arr = {'A', 'l', 'e', 'x', ' ', 'K', 'u', 'm', 'a', 'r'};
      String s5 = new String(arr);
      // arr[0] = 'B';

      // System.out.println(s5);

      // Character array Subset
      String s6 = new String(arr, 0, 6);
      System.out.println(s6);

      byte[] arr2 = {97, 98, 99};
      String s7 = new String(arr2, 0, 2);

      // System.out.println(s7);

      // String Buffer / String Builder
      StringBuffer sb = new StringBuffer("Hello");
      String s8 = new String(sb);

      System.out.println(s8);
    }
}

// Heap  --> s4 --> Aditya
// string pool  --> s3 --> Aditya