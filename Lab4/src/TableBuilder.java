public class TableBuilder implements IFurnitureBuilder {
    private Furniture furniture;
    private  String frame = "Table Frame";
    private  String seat = "Table Seat";
    private  String legs = "Table Legs";

    public TableBuilder() {
        this.furniture = new Furniture();
    }

    public TableBuilder setFrame(String frame) {
        this.frame=frame;
        return this;
    }

    public TableBuilder setSeat(String seat) {
       this.seat =seat;
        return this;
    }

    public TableBuilder setLegs(String legs) {
       this.legs=legs;
        return this;
    }

    @Override
    public void buildFrame() {
        furniture.setFrame(frame);
    }

    @Override
    public void buildSeat() {
        furniture.setSeat(seat);
    }

    @Override
    public void buildLegs() {
        furniture.setLegs(legs);
    }

    @Override
    public Furniture getResult() {
        return furniture;
    }
}
