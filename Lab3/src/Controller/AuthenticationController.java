package Controller;

import Controller.Abstractions.IAuthenticationController;
import Service.Abstractions.IAuthenticationService;

public class AuthenticationController implements IAuthenticationController {
    private IAuthenticationService _authenticationService;

    public AuthenticationController(IAuthenticationService authenticationService){
        _authenticationService = authenticationService;
    }

    public boolean login(String userName, String password){
        return _authenticationService.authenticate(userName, password);
    }

    public int getAttempts() {
        return _authenticationService.getAttempts();
    }
}