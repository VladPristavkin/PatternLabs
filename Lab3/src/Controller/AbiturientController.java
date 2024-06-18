package Controller;

import Beans.Abiturient;
import Controller.Abstractions.IAbiturientController;
import Service.Abstractions.IAbiturientService;

import java.util.List;

public class AbiturientController implements IAbiturientController {

    private IAbiturientService _abiturientService;

    public AbiturientController(IAbiturientService abiturientService) {
        _abiturientService = abiturientService;
    }
    @Override
    public List<Abiturient> getAbiturientsWithUnsatisfactoryGrades() {
      return   _abiturientService.getAbiturientsWithUnsatisfactoryGrades();
    }

    @Override
    public List<Abiturient> getAbiturientsWithTotalScoreAbove(int threshold) {
        return _abiturientService.getAbiturientsWithTotalScoreAbove(threshold);
    }

    @Override
    public List<Abiturient> getTopNAbiturients(int n) {
        return _abiturientService.getTopNAbiturients(n);
    }
}
