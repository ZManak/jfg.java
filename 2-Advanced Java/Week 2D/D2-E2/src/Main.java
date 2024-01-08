import logic.Car;
import utils.CarInventory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInventory<Car> carInventory = new CarInventory<>();
        carInventory.addCar(new Car("Toyota", "Corolla", 2015, 10000));
        carInventory.addCar(new Car("Toyota", "Camry", 2016, 15000));
        carInventory.addCar(new Car("Toyota", "Prius", 2017, 20000));
        carInventory.addCar(new Car("Ford", "Fiesta", 2018, 25000));
        carInventory.addCar(new Car("Ford", "Focus", 2019, 30000));
        carInventory.addCar(new Car("Mercedes", "C-Class", 2020, 35000));
        carInventory.addCar(new Car("Mercedes", "E-Class", 2021, 40000));

        carInventory.printInventory();
        System.out.println("Total inventory value: " + carInventory.calculateTotalValue());
        List<Car> toyotaCars = carInventory.searchByBrand("Toyota");
        System.out.println("Cars from Toyota: " + toyotaCars.stream().map(Car::getModel).toList());
        List<Car> carsFrom2018 = carInventory.searchByYear(2018);
        System.out.println("Cars from 2018: " + carsFrom2018.stream().map(Car::getModel).toList());
    }
}
