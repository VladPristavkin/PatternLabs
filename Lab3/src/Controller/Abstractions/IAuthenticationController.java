package Controller.Abstractions;

public interface IAuthenticationController {
    public boolean login(String userName, String password);
    public int getAttempts();
}
