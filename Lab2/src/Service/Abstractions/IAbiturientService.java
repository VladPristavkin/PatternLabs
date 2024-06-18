package Service.Abstractions;

import Beans.Abiturient;

import java.util.List;

public interface IAbiturientService {
    public List<Abiturient> getAbiturientsWithUnsatisfactoryGrades();
    public List<Abiturient> getAbiturientsWithTotalScoreAbove(int threshold);
    public List<Abiturient> getTopNAbiturients(int n);
}
