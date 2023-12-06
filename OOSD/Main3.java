package OOSD;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
    private String id;
    private boolean isAvailable;

    public Vehicle(String id) {
        this.id = id;
        this.isAvailable = true;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

class Bicycle extends Vehicle {
    public Bicycle(String id) {
        super(id);
    }
}

class Scooter extends Vehicle {
    public Scooter(String id) {
        super(id);
    }
}

class RentalSystem {
    private List<Bicycle> availableBicycles;
    private List<Scooter> availableScooters;

    public RentalSystem() {
        availableBicycles = new ArrayList<>();
        availableScooters = new ArrayList<>();
    }

    public void addBicycle(Bicycle bicycle) {
        availableBicycles.add(bicycle);
    }

    public void addScooter(Scooter scooter) {
        availableScooters.add(scooter);
    }

    public Bicycle rentBicycle() {
        for (Bicycle bicycle : availableBicycles) {
            if (bicycle.isAvailable()) {
                bicycle.setAvailable(false);
                return bicycle;
            }
        }
        return null;
    }

    public Scooter rentScooter() {
        for (Scooter scooter : availableScooters) {
            if (scooter.isAvailable()) {
                scooter.setAvailable(false);
                return scooter;
            }
        }
        return null;
    }

    public void returnBicycle(Bicycle bicycle) {
        bicycle.setAvailable(true);
    }

    public void returnScooter(Scooter scooter) {
        scooter.setAvailable(true);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("B001");
        Bicycle bicycle2 = new Bicycle("B002");
        Scooter scooter1 = new Scooter("S001");

        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.addBicycle(bicycle1);
        rentalSystem.addBicycle(bicycle2);
        rentalSystem.addScooter(scooter1);

        Bicycle rentedBicycle = rentalSystem.rentBicycle();
        if (rentedBicycle != null) {
            System.out.println("Rented Bicycle ID: " + rentedBicycle.getId());
        } else {
            System.out.println("No available bicycles.");
        }

        Scooter rentedScooter = rentalSystem.rentScooter();
        if (rentedScooter != null) {
            System.out.println("Rented Scooter ID: " + rentedScooter.getId());
        } else {
            System.out.println("No available scooters.");
        }

        rentalSystem.returnBicycle(rentedBicycle);
        rentalSystem.returnScooter(rentedScooter);

        System.out.println("Bicycle " + rentedBicycle.getId() + " returned.");
        System.out.println("Scooter " + rentedScooter.getId() + " returned.");
    }
}
