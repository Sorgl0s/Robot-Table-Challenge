import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Parser {
    private static ArrayList<Table> tables = new ArrayList<Table>();
    private static Table currentTable;
    private static boolean reading = true;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(reading) {
            String line = scanner.nextLine();
            parseLine(line);

        }
    }

    public static void parseLine(String line) {
        String[] words = line.split(" ");
        if (words.length > 1) {
            placeRobot(words[1]);
        }
        if (words[0].toLowerCase(Locale.ROOT).equals("report")) {

        }
    }

    public static void placeRobot(String coords) {
        String[] dimensions = coords.split(",");
        Point spawnpoint = new Point(Integer.parseInt(dimensions[0]), Integer.parseInt(dimensions[1]));
        currentTable.addRobot(new Robot(spawnpoint, Directions.valueOf(dimensions[2]), currentTable));
    }

    public static void printStatus() {
        for (Table table : tables) {
            System.out.println(table);
        }
    }



}
