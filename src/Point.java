public class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point add(Point otherPoint, int steps) {
        return new Point(x + steps * otherPoint.x, y + steps * otherPoint.y);
    }
}
