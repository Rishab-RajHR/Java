public class ScopeOfVariable {

    static String1 name = "Alex";  // global scope

    public static void main(String1[] args) {
        // Scope of a variable

         int x = 4;  // local scope
         int y = 5;

         if(x == 4){
            int j = 7;
            System.out.println(j);
         }

         System.out.println(x + " , " + y);

         fun();
    }

    static void fun() {
       int x = 4; // local scope
       int y = 5;
       System.out.println(x + " , " + y);

       System.out.println(name);
    }
}