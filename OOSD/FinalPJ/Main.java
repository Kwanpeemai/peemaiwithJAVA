package FinalPJ;

import java.util.ArrayList;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}

interface CarIterator {
    boolean hasNext();

    Car next();
}

// Concrete Iterator Class
class CarListIterator implements CarIterator {
    private ArrayList<Car> carList;
    private int index;

    public CarListIterator(ArrayList<Car> carList) {
        this.carList = new ArrayList<>(carList);
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < carList.size();
    }

    @Override
    public Car next() {
        if (hasNext()) {
            Car car = carList.get(index);
            index++;
            return car;
        }
        return null;
    }
}

class CarListSystem {
    private ArrayList<Car> carList;

    public CarListSystem() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public CarIterator getIterator() {
        return new CarListIterator(carList);
    }
}

public class Main {
    public static void main(String[] args) {

        CarListSystem list = new CarListSystem();
        list.addCar(new Car("B001"));
        list.addCar(new Car("B002"));
        list.addCar(new Car("B003"));

        CarIterator iterator = list.getIterator();

        while (iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println("Model: " + car.getModel());
        }
    }
}
