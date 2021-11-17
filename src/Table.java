import java.util.ArrayList;

public class Table {
    public final Point dimensions;
    private ArrayList<Robot> robots;

    public Table() {
        dimensions = new Point(5, 5);
        ArrayList<Robot> robots = new ArrayList<Robot>();
    }

    public Table(int width, int height) {
        dimensions = new Point(width, height);
    }
}
