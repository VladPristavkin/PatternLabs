package Service;

import Beans.User;
import Service.Abstractions.IAuthenticationService;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationService implements IAuthenticationService {
    private static AuthenticationService instance;
    private List<User> userList;
    private int attempts;

    private AuthenticationService(){
        userList = new ArrayList<>();
        userList.add(
                new User("admin", "admin")
        );
    }

    public static AuthenticationService getInstance() {
        if (instance == null) {
            instance = new AuthenticationService();
        }
        return instance;
    }

    public boolean authenticate(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        attempts++;
        return false;
    }

    public int getAttempts() {
        return attempts;
    }
}