public class Main {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.brand = "Ford";
        vehicle1.model = "Mustang";
        vehicle1.year = 2021;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.brand = "Tesla";
        vehicle2.model = "Model 3";
        vehicle2.year = 2019;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.brand = "Jeep";
        vehicle3.model = "Wrangler";
        vehicle3.year = 1990;

        System.out.println("Vehicle 1:");
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("Vehicle 2:");
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("Vehicle 3:");
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());
        
       vehicle1.displayInfo();
       vehicle2.displayInfo();
       vehicle3.displayInfo();
    }
}