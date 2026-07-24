public class AbstractClass2 {
     public static void main(String[] args) {
        Animal a = new Dog("Bruno");
        a.makeSound();
     }
}

abstract class Animal {

   String name;
   static String type;
  
   Animal(String  name) {
      this.name = name;
   }

    abstract void makeSound();

    final void sleep() {
       System.out.println("Sleeping");
    }

    // abstract private void eat() {

    // }
}

class Dog extends Animal {

   Dog(String name) {
      super(name);
   }

   @Override
   void makeSound() {
     System.out.println("Making Barking Sound");
   }
}

// Abstract classes
// 1. Cannot be instantiated directly 
// 2. Can contain abstract method (method without implementation)
// 3. Can also contain normal methods.
// 4. Is meant to be extended.


// Questions
// 1. Can abstract class have constructor ? --> Yes
// 2. Can abstract classes make final ? --> No
// 3. Can abstract classes have static methods/variables ? --> Yes
// 4. Can abstract classes have private methods ? --> Yes but non abstract
// 5. Can abstract classes have final methods ? --> Yes 
// 6. Can abstract classes have no abstract methods ? --> Yes 