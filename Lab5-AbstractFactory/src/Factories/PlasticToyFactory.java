package Factories;

import Abstractions.Car;
import Abstractions.Doll;
import Abstractions.IToyFactory;
import Toys.PlasticCar;
import Toys.PlasticDoll;

public class PlasticToyFactory implements IToyFactory {
    @Override
    public Car createCar() {
        return new PlasticCar();
    }

    @Override
    public Doll createDoll() {
        return new PlasticDoll();
    }
}
