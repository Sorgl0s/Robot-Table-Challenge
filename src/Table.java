import java.util.ArrayList;

public class Table {
    public final Point dimensions;
    private ArrayList<Robot> robots;
    private Robot currentRobot;
    public final int id;
    private static int numTables = 0;

    public Table() {
        dimensions = new Point(5, 5);
        ArrayList<Robot> robots = new ArrayList<Robot>();
        id = ++numTables;
    }

    public Table(int width, int height) {
        dimensions = new Point(width, height);
        id = ++numTables;
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void updateCurrentRobot(String command) {

    }

    @Override
    public String toString() {
        String output = "Table " + id + "\n";
        for (Robot robot : robots) {
            output += "\t" + robot.toString();
        }
        return output;
    }
}
