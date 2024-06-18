public class FurnitureDirector {
    private IFurnitureBuilder builder;

    public FurnitureDirector(IFurnitureBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildFrame();
        builder.buildSeat();
        builder.buildLegs();
    }

    public Furniture getFurniture() {
        return builder.getResult();
    }
}
