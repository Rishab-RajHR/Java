public class abstract33 {
     public static void main(String[] args) {
        Car car = new ElectricCar();  // Electric Car method is called
        // Car car = new FuelCar();  // Fuel Car method is called
        car.start();
        car.accelerate();
        car.brake();
     }
}

abstract class Car {
    void start() {
       System.out.println("Car Started");
    }

    abstract void accelerate();

    abstract void brake();
}

class FuelCar extends Car {
     
  @Override
  void accelerate() {
    System.out.println("Fuel Car is accelerating");
  }

  @Override
  void brake() {
     System.out.println("Fuel Car is Stopping");
  }
}

class ElectricCar extends Car {
     
  @Override
  void accelerate() {
       System.out.println("Electric Car is accelerating");
  }

  @Override
  void brake() {
       System.out.println("Electric Car is Stopping");
  }
}