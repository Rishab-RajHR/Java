public class switch2 {
     public static void main(String1[] args) {
        // Switch Statements
        int i = 3;

        switch(i) {  // switch(expression) --> byte, short, int, char, Enumeration
           case 1:
              System.out.println("i is 1");
              break;
           case 2:
              System.out.println("i is 2");
              break;
           case 3:
              System.out.println("i is 3");
              break;
          default:
              System.out.println("i is greater than 3");
              break;
        }

        // switch --> limited use case -> should evaluate to byte, short, int, char, Enumeration.
        // No duplicate cases allowed.
        // After JDK7 strings can also be used as switch expression.
        // After JDK-14 switch is enhanced too much.

        // if-else if ladder (in place of switch statement)
        // if (i == 1){
        //    System.out.println("i is 1");
        // }
        // else if(i == 2){
        //    System.out.println("i is 2");
        // }
        // else if(i == 3){
        //    System.out.println("i is 3");
        // }else{
        //     System.out.println("i is greater than 3");
        // }

        // Nested Switch 

        int j = 5;
        int k = 1;

        switch (j) {
          case 4:
            System.out.println("j is 4");
            break;
          case 5:
            switch (k) {
              case 1:
                 switch (j) {
                 
                   
                     }
               
              case 2:
                break;
            }
          
          default:
            System.out.println("j is not 4 && 5");
            break;
        }
     }
}
