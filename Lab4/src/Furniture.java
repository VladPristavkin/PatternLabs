public class Furniture {
    private String frame;
    private String seat;
    private String legs;

    public void setFrame(String frame) {
        if (frame == null || frame.trim().isEmpty()) {
            throw new IllegalArgumentException("Frame cannot be null or empty.");
        }
        this.frame = frame;
    }

    public void setSeat(String seat) {
        if (seat == null || seat.trim().isEmpty()) {
            throw new IllegalArgumentException("Seat cannot be null or empty.");
        }
        this.seat = seat;
    }

    public void setLegs(String legs) {
        if (legs == null || legs.trim().isEmpty()) {
            throw new IllegalArgumentException("Legs cannot be null or empty.");
        }
        this.legs = legs;
    }

    @Override
    public String toString() {
        String framePart = (frame != null) ? frame : "undefined frame";
        String seatPart = (seat != null) ? seat : "undefined seat";
        String legsPart = (legs != null) ? legs : "undefined legs";
        return "Furniture with " + framePart + ", " + seatPart + ", " + legsPart;
    }
}
