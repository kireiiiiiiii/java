// A Point object represents a pair of (x, y) coordinates.
public class Point {

    // instance variables
    int x;
    int y;

    // constructor - has to have the same name as the class

    // SLASH+STAR+STAR - creates a comment that says things abt the method:

    /**
     *
     * @param x - the x coordinate
     * @param y - the y coordinate
     */
    public Point(int x, int y) {
        // this reffers to variables in "this" class - instance variables above
        this.x = x;
        this.y = y;

        // or
        // setLocation(x, y);
    }

    public Point() {
        // call this contrsuctor - the one above - but give it 0, 0 as parameters
        this(0, 0);
    }

    /**
     *
     * @param x
     * @param y
     */
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

    public double distance(Point p) {
        // int dx = this.x - p.x;
        // int dy = this.y - p.y;
        return 0.0; // FIXME
    }

    public String toString() {
        return String.format("x: %d, y: %d", x, y);
    }
}
