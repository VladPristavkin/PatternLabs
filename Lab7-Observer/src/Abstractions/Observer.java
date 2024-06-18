package Abstractions;

import Models.Server;

public abstract class Observer {
    protected Server server;
    public abstract void update();
}
