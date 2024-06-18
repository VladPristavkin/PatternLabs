package Observers;

import Abstractions.Observer;
import Models.Server;

public class AdminObserver extends Observer {

    public AdminObserver(Server server) {
        this.server = server;
        this.server.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Admin notified. Server state: " + server.getState());
    }
}
