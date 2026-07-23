public class Polymorphism12 {
     public static void main(String[] args) {
        A a = new B();
        // B b = new B();
        // a.fun();
        // System.out.println(a.x);
        // System.out.println(b.x);
        System.out.println(a.getX());
     }
}

// Static --> They belong to class and not to objects (No overiding )
// Private methods cannot be overriden
//  Final makes constant (It cannot be overriden)

// Fields / Variables they cannot be polymeric

// class A {
//    static void fun() {
//      System.out.println("Hello");
//    }
//    private void fun2() {
//      System.out.println("Hello");
//    }
//    final void fun3() {
//      System.out.println("Hello");
//    }
// }

// class B extends A {
//     static void fun() {
//        System.out.println("Bye");
//     }
// }



class A {
  //  int x = 10;

  int getX() {
      return 10;
  }
}

class B extends A {
    // int x = 20;

     int getX() {
      return 20;
   }
}
