/**
 * A class that represents a path via pursuit curves.
 */
public class Path {

    private Point curr;
    private Point next;

    public Path(double x, double y) {
        curr = new Point(0, 0);
        next = new Point(x, y);
    }

    public double getCurrX() {
        return curr.getX();
    }

    public double getCurrY() {
        return curr.getY();
    }

    public double getNextX() {
        return next.getX();
    }

    public double getNextY() {
        return next.getY();
    }

    public Point getCurrentPoint() {
        return curr;
    }

    public void setCurrentPoint(Point point) {
        this.curr = point;
    }

    public void iterate(double dx, double dy) {
        curr = next;
        next = new Point(next.getX() + dx, next.getY() + dy);
    }
}
