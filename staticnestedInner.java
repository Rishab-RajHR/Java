public class staticnestedInner {
     public static void main(String[] args) {
       
      // Outer outer = new Outer();

      // Outer.Inner inner = new Outer.Inner();

      // Outer.Inner inner = outer.new Inner();

      // to do all things in one line

      Outer.Inner inner = new Outer().new Inner();

      inner.fun();
      inner.fun2();

     }
}

class Outer {

     int x = 10;

     class Inner {
        int x = 20;

        // Outer outer

         void fun() {
             System.out.println(x);
             System.out.println(Outer.this.x);
         }

         void fun2() {
            System.out.println("Hello");
         }
     }
}