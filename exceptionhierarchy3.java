public class exceptionhierarchy3 {
    public static void main(String[] args) {
         try {
            System.out.println(5 / 0);  // new Arithmetic Exception ("/ by zero");
            // String s = null;
            // s.length();
            Object obj = "Hello";
            Integer i = (Integer) obj; // new ClassCastException()
         } 
         catch(ArithmeticException | NullPointerException e) {
             System.out.println(e.getMessage());
         }
        catch(RuntimeException e) {
             System.out.println("Nulls are not allowed");
         }
        //  catch(Exception e){
        //     System.out.println("Some Generics Exception");
        //  }
    }
}
