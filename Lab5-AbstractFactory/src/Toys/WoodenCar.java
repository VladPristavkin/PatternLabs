package Toys;

import Abstractions.Car;

public class WoodenCar implements Car {
    @Override
    public void drive() {
        System.out.println("Wooden car is driving.");
    }
}
