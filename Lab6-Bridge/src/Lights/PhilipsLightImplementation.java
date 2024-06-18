package Lights;

import Abstractions.LightImplementation;

public class PhilipsLightImplementation implements LightImplementation {

    @Override
    public void turnOn() {
        System.out.println("Philips light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Philips light is turned off.");
    }

    @Override
    public void dim() {
        System.out.println("Philips light is dimmed.");
    }
}
