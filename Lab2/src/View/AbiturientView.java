package View;

import Beans.Abiturient;
import Controller.AbiturientController;
import Controller.Abstractions.IAbiturientController;

import java.util.List;

public class AbiturientView {
    private IAbiturientController _abiturientController;

    public AbiturientView(IAbiturientController abiturientController) {
        _abiturientController = abiturientController;
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
