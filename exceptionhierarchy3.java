public class exceptionhierarchy3 {
    public static void main(String[] args) {
         try {
            System.out.println(5 / 0);  // new Arithmetic Exception ("/ by zero");
            // String s = null;
            // s.length();
         } 
         catch(ArithmeticException e) {
             System.out.println("Generic Exception Occured");
         }
        catch(NullPointerException e) {
             System.out.println("Nulls are not allowed");
         }
    }
}
