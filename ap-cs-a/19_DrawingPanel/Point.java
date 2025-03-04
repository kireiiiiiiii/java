
/**
 * AUTHOR: Book authors (modified by Mr. Methvin)
 * CREATED DATE: When was this book published?
 */

// A Point object represents a pair of (x, y) coordinates.
public class Point {
    public int x;
    public int y;

    /**
     * Default constructor. Initializes Point object to origin (0, 0)
     */
    public Point() {
        setLocation(0, 0);
    }

    /**
     * Parameterized constructor. Initializes Point object based on x and y
     * arguments.
     *
     * @param x - (int) x value to initialize Point to.
     * @param y - (int) y value to initialize Point to.
     */
    public Point(int x, int y) {
        setLocation(x, y);
    }

    /**
     * Computes the distance of this point from origin.
     *
     * @return (double) distance from origin.
     */
    public double distanceFromOrigin() {
        return distance(new Point());
    }

    /**
     * Computes distance (using distance formula) of this Point from another Point.
     *
     * @param p - (Point) object to compare against
     * @return (double) the distance between two points.
     */
    public double distance(Point p) {
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * Accessor method for field x
     *
     * @return (int) value stored in field x
     */
    public final int getX() {
        return x;
    }

    /**
     * Accessor method for field y
     *
     * @return (int) value stored in field y
     */
    public final int getY() {
        return y;
    }

    /**
     * Mutator method (setter) for setting coordinate value x/y
     *
     * @param x (int) value field x will be set to.
     * @param y (int) value field y will be set to.
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Mutator method (setter) for setting coordinate value x
     *
     * @param x (int) value field x will be set to.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Mutator method (setter) for setting coordinate value y
     *
     * @param y (int) value field y will be set to.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Override Object's toString method to print out class state
     * (coordinates x and y)
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Mutator that translates points x and y based on offsets dx and dy.
     *
     * @param dx (int) amount to offset field x by.
     * @param dy (int) amount to offset field y by.
     */
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}
