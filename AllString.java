public class AllString {
    public static void main(String[] args) {
       String s1 = new String("");

       String s2 = new String("Hello");

       String s3 = "Alex";
       String s4 = new String(s3);

       System.out.println(s2);
    }
}

// Heap  --> s4 --> Aditya
// string pool  --> s3 --> Aditya