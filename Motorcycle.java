public class Motorcycle extends Vehicle {
    private String type; 

    public Motorcycle(String brand, String model, int year, String type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
    
     @Override
    public void moveForward() {
        System.out.println("A motorcycle moves forward");   
    }
    
    @Override
    public void moveBackward() {
        System.out.println("A motorcycle moves backward");
    }
    
    @Override
    public void moveLeft() {
        System.out.println("A motorcycle moves left");
    }
       
    @Override
    public void moveRight() {
        System.out.println("A motorcycle moves right");
    }
}