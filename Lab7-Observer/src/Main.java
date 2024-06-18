import Models.Server;
import Observers.AdminObserver;
import Observers.UserObserver;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();

        new AdminObserver(server);
        new UserObserver(server);

        System.out.println("Setting server state to 'Running'.");
        server.setState("Running");

        System.out.println("Setting server state to 'Down'.");
        server.setState("Down");
    }
}
