package Factories;

import Abstractions.Car;
import Abstractions.Doll;
import Abstractions.IToyFactory;
import Toys.WoodenCar;
import Toys.WoodenDoll;

public class WoodenToyFactory implements IToyFactory {
    @Override
    public Car createCar() {
        return new WoodenCar();
    }

    @Override
    public Doll createDoll() {
        return new WoodenDoll();
    }
}
