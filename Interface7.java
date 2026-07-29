public class Interface7 {
     public static void main(String[] args) {
         C c = new C();
         c.fun();
     }
}

// Java Resolution prority rule

interface A {
     default void fun() {
        System.out.println("Inside A interface");
     }  
}

class B {
      public void fun() {
        System.out.println("Inside B class");
     } 
}


class C extends B implements A {
      @Override
      public void fun() {
         System.out.println("This is the Derived class");
      }
}

