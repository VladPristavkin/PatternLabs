import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Furniture> furnitureList = new ArrayList<>();


        IFurnitureBuilder chairBuilder = new ChairBuilder()
                .setFrame("Metal Frame")
                .setSeat("Leather Seat")
                .setLegs("Metal Legs");
        FurnitureDirector chairDirector = new FurnitureDirector(chairBuilder);
        chairDirector.construct();
        furnitureList.add(chairDirector.getFurniture());

        IFurnitureBuilder tableBuilder = new TableBuilder()
                .setFrame("Wooden Frame")
                .setSeat("Marble Top")
                .setLegs("Wooden Legs");
        FurnitureDirector tableDirector = new FurnitureDirector(tableBuilder);
        tableDirector.construct();
        furnitureList.add(tableDirector.getFurniture());

        for (Furniture furniture : furnitureList) {
            System.out.println(furniture);
        }
    }
}
