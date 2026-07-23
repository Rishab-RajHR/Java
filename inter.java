public class inter {
    public static void main(String[] args) {
       Car car = new ElectricCar();
       car.start();
       car.accelerate();
       car.brake();
    }
}

interface Car {
   void start();

   void accelerate();

   void brake();
}

class FuelCar implements Car {

  public void start() {
     System.out.println("Fuel Car has started");
  }
     
  @Override
  public void accelerate() {
    System.out.println("Fuel Car is accelerating");
  }

  @Override
  public void brake() {
     System.out.println("Fuel Car is Stopping");
  }
}

class ElectricCar implements Car {

  public void start() {
     System.out.println("Fuel Car has started");
  }
     
  @Override
  public void accelerate() {
       System.out.println("Electric Car is accelerating");
  }

  @Override
  public void brake() {
       System.out.println("Electric Car is Stopping");
  }
}
