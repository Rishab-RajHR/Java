public class forloop {
     public static void main(String1[] args) {
        // 1 to 10

     //    for(int i=1; i <= 10; i++) {  // boolean --> true / false
     //        System.out.println(i);
     //    }

        /*
         Flow of control of for
         1. First assignment statement is executed (variable definition).
         2. Then second conditional statement is evaluated. (True / false)
         3. If true, control flow will evaluate the body of the loop
         4. Once loop body is finished, control flow will go back to the for statement, and third increment statement will be evaluated.
         5. Again, conditional statement is evaluated.
         6. Repeat 2 - 5.
        */


      // for loop in reverse direction 
      
     //  for(int j=10; j>=1; j--) {
     //       System.out.println(j);
     //  }


       // Infinite Loop

     //   int i = 5;

     //   while(i < 10) {

     //   }
     //   System.out.println("Hello");



     //  for(int i=1; i<10; i++) {
     //       System.out.println("Hello");
     //  }


     // Comma Seperated Variation
     //  for(int i=1; i<=10; i++){
     //       System.out.println(i*i);
     //  }


     
     // for(int i=1, j=1; i <= 10; i++, j+=2){
     //      System.out.println(i * j);
          // 1 * 1 = 1
          // 2 * 3 = 6
          // 3 * 5 = 15
          // 4 * 7 = 28
     // }

     //  boolean b = true;
     //  for(int i=1; b == true; i++) {
     //     if(condition) {
     //        b = false;
     //     }
     //  }


      // Integers -> byte, short, int,  long

     //   for(int i=1; i <= 10; i++){
     //      System.out.println(i);
     //    }


     // Nested Loops
     //  for(int i = 1; i <= 5; i++) {
     //      for(int j = 1; j <= i; j++){
     //              System.out.print("* ");
     //      }
     //      System.out.println();
     //  }


     /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */


     // Jump Statements in Java
     // break, continue
     
     // for(int i = 1; i <= 10; i++){
     //       System.out.println(i);

     //       if(i > 5){
     //           break;
     //       }
     // }


     // Number is Prime or not
     // int p = 9;

     // // 2, 3, 4, 5, .....8

     // int i;
     // for(i = 2; i < p; i++) {
     //      if(p % i == 0){
     //           System.out.println("The number is not prime");
     //           break;
     //      }
     // }

     //  if(i == p){
     //      System.out.println("The number is prime");
     //  }



     // Continue statement

     //  for(int i=1; i<=10; i++) {
     //      if(i % 2 != 0) {
     //            System.out.println(i);
     //      }
     //  }


     //  for(int i=1; i<=10; i++) {

     //      if(i % 2 == 0) {
     //          continue; 
     //      }
     //      System.out.println(i);
     //  }


     //    for(int i = 1; i <= 10; i++) {
     //      for(int j = 1; j <= i; j++){
     //              System.out.print("* ");

     //              if(j >= 5){
     //                  break;
     //              }
     //      }
     //      System.out.println();
     //  }


     // Labels

     //     outer: for(int i = 1; i <= 10; i++) {
     //      inner: for(int j = 1; j <= i; j++){
     //              System.out.print("* ");

     //              if(j >= 5){
     //                  break outer;
     //              }
     //      }
     //      System.out.println();
     //      }



     // Code blocks
     first: {
           second: {
               third: {
                    System.out.println("Hello");
                    break first;
               }
           }
     }

     }
}
