package Controller.Abstractions;

import Beans.Abiturient;

import java.util.List;

public interface IAbiturientController {
    public List<Abiturient> getAbiturientsWithUnsatisfactoryGrades();
    public List<Abiturient> getAbiturientsWithTotalScoreAbove(int threshold);
    public List<Abiturient> getTopNAbiturients(int n);
}
