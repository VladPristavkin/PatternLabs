package Lights;

import Abstractions.Light;
import Abstractions.LightImplementation;

public class FluorescentLight extends Light {

    public FluorescentLight(LightImplementation lightImplementation) {
        super(lightImplementation);
    }

    @Override
    public void turnOn() {
        lightImplementation.turnOn();
    }

    @Override
    public void turnOff() {
        lightImplementation.turnOff();
    }

    @Override
    public void dim() {
        lightImplementation.dim();
    }
}
