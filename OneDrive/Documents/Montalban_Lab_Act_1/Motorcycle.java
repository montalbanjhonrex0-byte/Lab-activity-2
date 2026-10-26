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
}