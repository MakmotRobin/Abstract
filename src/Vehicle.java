abstract class Vehicle {
    String type;
    int numberOfWheels;

    Vehicle(String type, int numberOfWheels) {
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }

    void showVehicleDetails() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }

    abstract void doVehicleSound();
}

class Car extends Vehicle {
    int numberOfDoors;
    double carPrice;

    Car(int wheels, int doors, double price) {
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carPrice = price;
    }

    @Override
    void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    void doVehicleSound() {
        System.out.println("Beep beep!");
    }
}

class Boat extends Vehicle {
    double maxKnotsSpeed;
    int boatKilosWeight;

    Boat(double maxSpeed, int weight) {
        super("Boat", 0); // Boats typically have no wheels
        this.maxKnotsSpeed = maxSpeed;
        this.boatKilosWeight = weight;
    }

    @Override
    void doVehicleSound() {
        System.out.println("Toot toot!");
    }

    String getBoatWeightAndSpeed() {
        return "Boat Weight: " + boatKilosWeight + " kilos\nBoat Max Speed: " + maxKnotsSpeed + " knots";
    }
}

public class VehicleTester {
    public static void main(String[] args) {
        Car myCar = new Car(4, 4, 25000.0);
        Boat myBoat = new Boat(30.0, 1500);

        myCar.showVehicleDetails();
        myCar.doVehicleSound();

        myBoat.showVehicleDetails();
        myBoat.doVehicleSound();

        System.out.println(myBoat.getBoatWeightAndSpeed());
    }
}