public class Car extends Vehicle implements Serviceable {
    private int numberOfDoors;

    public Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void moveForward() {
        System.out.println("A car moves forward");
    }
    

    @Override
    public void moveBackward() {
        System.out.println("A car moves backward");
    }

    @Override
    public void moveLeft() {
        System.out.println("A car moves left");
    }

    @Override
    public void moveRight() {
        System.out.println("A car moves right");
    }
    
    public void service() {
      System.out.println("Check oil brakes.");
   }
}
