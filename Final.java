public class Final {
    public static void main(String[] args) {
         Random r1 = new Random();
         System.out.println(r1.PI);

        //  r1.PI = 3.16; => Cannot be reassigned

        final int x = 4;
        System.out.println(x);
    }
}

class Random {
   final double PI;

   Random() {
      this.PI = 3.14;
   }

  //  static keyword
  // class Random {
  //    static final double PI;

  //    static {
  //      PI = 3.14;
  //    }
  // }

}