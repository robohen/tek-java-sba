public class MyOwnAutoShop {

    public static void main(String[] args) {
        // instances of Sedan, Ford, and Car classes
        Sedan sedan = new Sedan(60, 30000, "Blue", 18);
        Ford ford1 = new Ford(70, 25000, "Red", 2022, 1500);
        Ford ford2 = new Ford(75, 30000, "Green", 2023, 2000);
        Car car = new Car(50, 20000, "Black");
        Truck truck = new Truck(60, 40000, "Yellow", 3000);

        // Display sale prices for all instances
        System.out.println("Sedan Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford 1 Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford 2 Sale Price: " + ford2.getSalePrice());
        System.out.println("Car Sale Price: " + car.getSalePrice());
        System.out.println("Truck Sale Price: " + truck.getSalePrice());
    }
}
