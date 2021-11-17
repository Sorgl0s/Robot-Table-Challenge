public enum Directions {
    NORTH (new Point(0, 1)),
    EAST (new Point(1, 0)),
    SOUTH (new Point(0, -1)),
    WEST (new Point(-1, 0));

    private final Point unitVector;
    private static final Directions[] vals = values();

    Directions(Point unitVector) {
        this.unitVector = unitVector;
    }

    public Point getUnitVector() {
        return unitVector;
    }

    // Method ripped from answer here:
    // https://stackoverflow.com/questions/17006239/whats-the-best-way-to-implement-next-and-previous-on-an-enum-type
    public Directions turnRight() {
        return vals[(this.ordinal()+1) % vals.length];
    }

    public Directions turnLeft() {
        return vals[(this.ordinal()-1) % vals.length];
    }
}
