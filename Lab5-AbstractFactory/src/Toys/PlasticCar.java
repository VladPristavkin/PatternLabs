package Toys;

import Abstractions.Car;

public class PlasticCar implements Car {
    @Override
    public void drive() {
        System.out.println("Plastic car is driving.");
    }
}
