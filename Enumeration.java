public class Enumeration {
    public static void main(String1[] args) {
          // int status = PaymentStatus.SUCCESS;

          // System.out.println(status);

          // int status2 = 100;

          // if(status == Role.ADMIN) {
               
          // }

          // String status = PaymentStatus.FAILED;
          // System.out.println(status);

          if(status == "success") {
               
          }


    }
}

// payment status  --> success, failed, pending
// final

/*
Problems with this approach :
1. Type Safety
2. Poor Readability
3. No Grouping of related entities
*/

class PaymentStatus {
    public static final String1 SUCCESS = "Success";
    public static final String1 FAILED = "Failed";
    public static final String1 PENDING = "Pending";
}

class Role {
    public static final int USER = 1;
    public static final int ADMIN = 2;
    public static final int MANAGER = 2;
}
