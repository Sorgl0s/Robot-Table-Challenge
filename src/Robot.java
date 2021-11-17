public class Robot {
    private Point location;
    private Directions direction;
    private Table table;

    public Robot(Point spawnpoint, Directions direction, Table table) {
        location = spawnpoint;
        this.direction = direction;
        this.table = table;
    }

    public void move(int distance) {
        Point newLoc = location.add(direction.getUnitVector(), distance);
        if (newLoc.x < table.dimensions.x && newLoc.y < table.dimensions.y
                && newLoc.x >= 0 && newLoc.y >= 0) {
            location = newLoc;
        }
    }

    public void turn(String turningDirection) {
        if (turningDirection.equals("LEFT")) {
            direction = direction.turnLeft();
        }
        if (turningDirection.equals("RIGHT")) {
            direction = direction.turnRight();
        }
    }

    @Override
    public String toString() {
        return location.x + "," + location.y + "," + direction.name();
    }
}
