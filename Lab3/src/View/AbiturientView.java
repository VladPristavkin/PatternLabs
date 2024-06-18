package View;

import Beans.Abiturient;
import Controller.Abstractions.IAbiturientController;
import Controller.Abstractions.IAuthenticationController;

import java.util.List;
import java.util.Scanner;

public class AbiturientView {
    private IAbiturientController _abiturientController;
    private IAuthenticationController _authenticationController;
    private Scanner scanner;

    public AbiturientView(IAbiturientController abiturientController, IAuthenticationController authenticationController) {
        _abiturientController = abiturientController;
        _authenticationController=authenticationController;
        this.scanner = new Scanner(System.in);
    }

    public boolean authenticateUser() {
        while (true) {
            System.out.println("Please enter your username:");
            String username = scanner.nextLine();
            System.out.println("Please enter your password:");
            String password = scanner.nextLine();
            try {
                if(!_authenticationController.login(username, password)){
                    throw new Exception("Invalid username or password");
                }
                System.out.println("Authentication successful!");
                return true;
            } catch (Exception e) {
                System.out.println("Authentication failed: " + e.getMessage());
                if (_authenticationController.getAttempts() >= 5) {
                    System.out.println("You have exceeded the maximum number of login attempts.");
                    return false;
                }
            }
        }
    }

    public void displayAbiturientsWithUnsatisfactoryGrades() {
        System.out.println("Displaying abiturients with unsatisfactory grades:");
        try {
            List<Abiturient> abiturients = _abiturientController.getAbiturientsWithUnsatisfactoryGrades();
            if (abiturients.isEmpty()) {
                System.out.println("No abiturients with unsatisfactory grades found.");
            } else {
                abiturients.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Error retrieving abiturients with unsatisfactory grades: " + e.getMessage());
        }
        System.out.println();
    }

    public void displayAbiturientsWithTotalScoreAbove(int threshold) {
        System.out.println("Displaying abiturients with total score above " + threshold + ":");
        try {
            List<Abiturient> abiturients = _abiturientController.getAbiturientsWithTotalScoreAbove(threshold);
            if (abiturients.isEmpty()) {
                System.out.println("No abiturients with total score above " + threshold + " found.");
            } else {
                abiturients.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Error retrieving abiturients with total score above " + threshold + ": " + e.getMessage());
        }
        System.out.println();
    }

    public void displayTopNAbiturients(int n) {
        System.out.println("Displaying top " + n + " abiturients with highest scores:");
        try {
            List<Abiturient> abiturients = _abiturientController.getTopNAbiturients(n);
            if (abiturients.isEmpty()) {
                System.out.println("No abiturients found.");
            } else {
                abiturients.forEach(System.out::println);
            }
        } catch (Exception e) {
            System.out.println("Error retrieving top " + n + " abiturients: " + e.getMessage());
        }
        System.out.println();
    }
}
