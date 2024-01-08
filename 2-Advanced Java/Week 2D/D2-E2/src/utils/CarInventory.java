package utils;

import logic.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class CarInventory<T extends Car> {
    private List<T> cars;

    public CarInventory() {
        this.cars = new ArrayList<>();
    }
    public void addCar(T car) {
        this.cars.add(car);
        System.out.println("Car added to inventory " + car.getBrand() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice());
    }

    public T getCar(int index) {
        return cars.get(index);
    }

    public List<T> searchByBrand(String brand) {
        return new ArrayList<>(cars.stream().filter(car -> car.getBrand().equals(brand)).toList());
    }

    public List<T> searchByYear(int year) {
        return new ArrayList<>(cars.stream().filter(car -> car.getYear() == year).toList());
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        for (T car : cars) {
            totalValue += car.getPrice();
        }
        return totalValue;
    }

    public void printInventory() {
        for (T car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getYear() + " " + car.getPrice());
        }
    }

}
