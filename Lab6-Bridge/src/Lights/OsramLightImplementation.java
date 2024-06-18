package Lights;

import Abstractions.LightImplementation;

public class OsramLightImplementation implements LightImplementation {

    @Override
    public void turnOn() {
        System.out.println("Osram light is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Osram light is turned off.");
    }

    @Override
    public void dim() {
        System.out.println("Osram light is dimmed.");
    }
}

