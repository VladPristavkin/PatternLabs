import Controller.AbiturientController;
import Controller.Abstractions.IAbiturientController;
import Controller.Abstractions.IAuthenticationController;
import Controller.AuthenticationController;
import DAL.Abstractions.IData;
import DAL.Data;
import Service.AbiturientService;
import Service.Abstractions.IAbiturientService;
import Service.Abstractions.IAuthenticationService;
import Service.AuthenticationService;
import View.AbiturientView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IAuthenticationService userService = AuthenticationService.getInstance();
        IAuthenticationController authenticationController = new AuthenticationController(userService);

        IData data = new Data();
        IAbiturientService service = new AbiturientService(data);
        IAbiturientController controller = new AbiturientController(service);
        AbiturientView view = new AbiturientView(controller, authenticationController);

        if(view.authenticateUser()) {
            view.displayAbiturientsWithUnsatisfactoryGrades();
            System.out.println();
            view.displayAbiturientsWithTotalScoreAbove(10);
            System.out.println();
            view.displayTopNAbiturients(3);
        }
    }
}