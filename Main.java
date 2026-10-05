public class Main {
    public static void main(String[] args) {

        
        Vehicle v1 = new Vehicle("Ford", "Mustang", 2021);
        Vehicle v2 = new Vehicle("Tesla", "Model 3", 2019);
        Vehicle v3 = new Vehicle("Jeep", "Wrangler", 1990);

        
        System.out.println("\n=== Vehicle 1 ===");
        v1.displayInfo();
        System.out.println("Brand: " + v1.getBrand());
        System.out.println("Model: " + v1.getModel());
        System.out.println("Year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        
        System.out.println("\n=== Vehicle 2 ===");
        v2.displayInfo();
        System.out.println("Brand: " + v2.getBrand());
        System.out.println("Model: " + v2.getModel());
        System.out.println("Year: " + v2.getYear());
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage: " + v2.isVintage());

        
        System.out.println("\n=== Vehicle 3 ===");
        v3.displayInfo();
        System.out.println("Brand: " + v3.getBrand());
        System.out.println("Model: " + v3.getModel());
        System.out.println("Year: " + v3.getYear());
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage: " + v3.isVintage());

       
        System.out.println("\n=== setYear() Tests ===");

       
        System.out.println("setYear(2000): " + v1.setYear(2000));
        System.out.println("Stored year: " + v1.getYear());
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage: " + v1.isVintage());

        
        System.out.println("\nsetYear(1885): " + v1.setYear(1885));
        System.out.println("Stored year: " + v1.getYear());

       
        System.out.println("\nsetYear(2027): " + v1.setYear(2027));
        System.out.println("Stored year: " + v1.getYear());

       
        System.out.println("\n=== Constructor Validation Tests ===");

    
        Vehicle invalidVehicle1 =
                new Vehicle("Test", "Vehicle", 1885);

        System.out.println("New vehicle with year 1885");
        System.out.println("Initial year: "
                + invalidVehicle1.getYear());

    
        Vehicle invalidVehicle2 =
                new Vehicle("Test", "Vehicle", 2027);

        System.out.println("New vehicle with year 2027");
        System.out.println("Initial year: "
                + invalidVehicle2.getYear());
    }
}