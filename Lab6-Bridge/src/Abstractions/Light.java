package Abstractions;

public abstract class Light {
    protected LightImplementation lightImplementation;

    protected Light(LightImplementation lightImplementation) {
        this.lightImplementation = lightImplementation;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void dim();
}
