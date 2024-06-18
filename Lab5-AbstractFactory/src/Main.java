import Abstractions.Car;
import Abstractions.Doll;
import Abstractions.IToyFactory;
import Factories.PlasticToyFactory;
import Factories.WoodenToyFactory;

public class Main {
    public static void main(String[] args) {
        IToyFactory plasticFactory = new PlasticToyFactory();
        Car plasticCar = plasticFactory.createCar();
        Doll plasticDoll = plasticFactory.createDoll();

        plasticCar.drive();
        plasticDoll.play();

        IToyFactory woodenFactory = new WoodenToyFactory();
        Car woodenCar = woodenFactory.createCar();
        Doll woodenDoll = woodenFactory.createDoll();

        woodenCar.drive();
        woodenDoll.play();
    }
}
