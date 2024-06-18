package Observers;

import Abstractions.Observer;
import Models.Server;

public class UserObserver extends Observer {

    public UserObserver(Server server) {
        this.server = server;
        this.server.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("User notified. Server state: " + server.getState());
    }
}
