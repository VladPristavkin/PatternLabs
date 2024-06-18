package Service.Abstractions;

import Service.AuthenticationService;

public interface IAuthenticationService {
    boolean authenticate(String username, String password);
    public int getAttempts();
    static AuthenticationService getInstance(){
        return null;
    };
}