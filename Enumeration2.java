public class Enumeration2 {
    public static void main(String[] args) {
      //  int status = PaymentStatus2.SUCCESS;

      PaymentStatus status = PaymentStatus.SUCCESS;

      System.out.println(status.name());
    }
}

// Enum --> Enumeration ( Enumerated type )
// Enum --> Predefined set of constants.

enum PaymentStatus {
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2 {
   public static final int SUCCESS = 1;
   public static final int FAILED = 2;
   public static final int PENDING = 3;
}
