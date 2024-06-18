package DAL;

import Beans.Abiturient;
import DAL.Abstractions.IData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data implements IData {
    @Override
    public List<Abiturient> getAbiturients() {
        return new ArrayList<Abiturient>(Arrays.asList(
                new Abiturient(1, "Ivanov", "Ivan", "Ivanovich", "Moscow", "123456789", Arrays.asList(5, 4, 3)),
                new Abiturient(2, "Petrov", "Petr", "Petrovich", "Saint Petersburg", "987654321", Arrays.asList(2, 3, 2)),
                new Abiturient(3, "Sidorov", "Sidr", "Sidorovich", "Novosibirsk", "456789123", Arrays.asList(4, 5, 5)),
                new Abiturient(4, "Smirnov", "Sergey", "Sergeevich", "Kazan", "321654987", Arrays.asList(3, 4, 4)),
                new Abiturient(5, "Kuznetsov", "Alexey", "Alexeevich", "Yekaterinburg", "147258369", Arrays.asList(5, 5, 5)),
                new Abiturient(6, "Popov", "Andrey", "Andreevich", "Samara", "159357486", Arrays.asList(2, 2, 3)),
                new Abiturient(7, "Vasilyev", "Vasily", "Vasilyevich", "Omsk", "753159842", Arrays.asList(4, 4, 4)),
                new Abiturient(8, "Mikhailov", "Mikhail", "Mikhailovich", "Ufa", "951357462", Arrays.asList(3, 3, 4)),
                new Abiturient(9, "Fedorov", "Fedor", "Fedorovich", "Rostov-on-Don", "852456753", Arrays.asList(5, 4, 4)),
                new Abiturient(10, "Semenov", "Semen", "Semenovich", "Voronezh", "963258741", Arrays.asList(2, 3, 2))
        ));
    }
}
