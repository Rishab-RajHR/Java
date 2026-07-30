public class Interface1 {
    public static void main(String1[] args) {
       Payment p = new CreditCard();
       p.pay();
    }
}

// Polymorphism

interface Payment  {
   void pay();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
      System.out.println("Paying via credit card");
    }
}

class DebitCard implements Payment {
    @Override
    public void pay() {
      System.out.println("Paying via debit card");
    }
}