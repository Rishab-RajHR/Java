// Local Classes

public class LocalClass {
     public static void main(String[] args) {
         Outer outer = new Outer();
         outer.greet();
     }
}

// Effective Final Variable

class Outer {

    void greet() {

         int y = 5;

        class Local {
            void sayhello() {
                System.out.println(y);
            }

        }

        Local local = new Local();
        local.sayhello();
    }
}

// Constructor, Method, If, Loop, Static Block
