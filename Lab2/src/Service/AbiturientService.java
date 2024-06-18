package Service;

import Beans.Abiturient;
import DAL.Abstractions.IData;
import DAL.Data;
import Service.Abstractions.IAbiturientService;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AbiturientService implements IAbiturientService {
    private IData _dalData;

    public AbiturientService(IData dalData){
        _dalData = dalData;
    }

    @Override
    public List<Abiturient> getAbiturientsWithUnsatisfactoryGrades() {
        var data= _dalData.getAbiturients();

        return data.stream()
                .filter(abiturient -> abiturient.getGrades().stream().anyMatch(grade -> grade < 3))
                .collect(Collectors.toList());
    }

    @Override
    public List<Abiturient> getAbiturientsWithTotalScoreAbove(int threshold) {
        var data= _dalData.getAbiturients();

        return data.stream()
                .filter(abiturient -> abiturient.getGrades().stream().mapToInt(Integer::intValue).sum() > threshold)
                .collect(Collectors.toList());
    }

    @Override
    public List<Abiturient> getTopNAbiturients(int n) {
        var data= _dalData.getAbiturients();

        return data.stream()
                .sorted(Comparator.comparingInt(abiturient -> abiturient.getGrades().stream().mapToInt(Integer::intValue).sum()))
                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                    Collections.reverse(list);
                    return list.stream().limit(n).collect(Collectors.toList());
                }));
    }
}
