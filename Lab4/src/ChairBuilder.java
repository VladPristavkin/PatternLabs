public class ChairBuilder implements IFurnitureBuilder {
    private Furniture furniture;
    private  String frame = "Chair Frame";
    private  String seat = "Chair Seat";
    private  String legs = "Chair Legs";

    public ChairBuilder() {
        this.furniture = new Furniture();
    }

    public ChairBuilder setFrame(String frame) {
        this.frame=frame;
        return this;
    }

    public ChairBuilder setSeat(String seat) {
        this.seat=seat;
        return this;
    }

    public ChairBuilder setLegs(String legs) {
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
