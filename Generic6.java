public class Generic6 {
    public static void main(String[] args) {
    
    }
}

class Animal {
    void display() {
       System.out.println("I am an animal");
    }
}

interface Swimmable {
    void swim();
}

class Dog extends Animal {
    
}

class Fish extends Animal implements Swimmable{
   @Override
   public void swim() {
      System.out.println("Swimming ");
   }
}
