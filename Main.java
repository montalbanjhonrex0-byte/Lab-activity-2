public class Main {
    
    public static void printDetails(Vehicle vehicle) {
        vehicle.displayInfo();
    }
    
    public static void printAction(Vehicle vehicle) {
         vehicle.moveForward();
         vehicle.moveBackward();
         vehicle.moveLeft();
         vehicle.moveRight();
    }
    
    public static void main(String[] args) {

        
        Vehicle vehicle = new Car("Toyota", "Vios", 2026, 4);
        vehicle.displayInfo();
        System.out.println();

        
        vehicle = new Motorcycle("Honda", "XRM", 2015, "Manual");
        vehicle.displayInfo();
        System.out.println();

        
        vehicle = new Truck("Isuzu", "Giga", 2022, 10);
        vehicle.displayInfo();
        System.out.println();

        
        System.out.println("\n=== 2. Method Parameter ===");
        Car car = new Car("Tesla", "Roadster", 2026, 4);
        Motorcycle motor = new Motorcycle("NMAX", "V3", 2026, "Automatic");
        
        Truck truck = new Truck("Hino", "500", 2024, 8);

        printDetails(car);
        System.out.println();
        printDetails(motor);
        System.out.println();
        printDetails(truck);

        
        System.out.println("\n=== 3. Polymorphic Array ===");

        Vehicle[] vehicles = {
            new Car("Tesla", "Roadster", 2026, 4),
            new Motorcycle("NMAX", "V3", 2026, "Automatic"),
            new Truck("Hino", "500", 2024, 6)
        };

        for (Vehicle currentVehicle : vehicles) {
            printDetails(currentVehicle);
            printAction(currentVehicle);
            System.out.println();
        }
            
    }
}