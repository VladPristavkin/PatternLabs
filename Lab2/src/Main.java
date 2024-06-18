import Controller.AbiturientController;
import Controller.Abstractions.IAbiturientController;
import DAL.Abstractions.IData;
import DAL.Data;
import Service.AbiturientService;
import Service.Abstractions.IAbiturientService;
import View.AbiturientView;

public class Main {
    public static void main(String[] args) {

        IData data = new Data();
        IAbiturientService service = new AbiturientService(data);
        IAbiturientController controller = new AbiturientController(service);
        AbiturientView view = new AbiturientView(controller);

        view.displayAbiturientsWithUnsatisfactoryGrades();
        System.out.println();
        view.displayAbiturientsWithTotalScoreAbove(10);
        System.out.println();
        view.displayTopNAbiturients(3);
    }
}