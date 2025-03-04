import java.awt.*;

/*
This client program uses Point objects.
Expected console output:

p1 is (400, 200)
p2 is (400, 300)
p1's distance from origin is 447.21359549995793
p1 is now (450, 250)
p2 is now (350, 250)

Expected graphics output: points p1, p2 and all points in array points and points2
are drawn to window.
*/
public class PointClient {
    public static void main(String[] args) {

        // Create Drawing panel
        DrawingPanel panel = new DrawingPanel(800, 600);
        Graphics g = panel.getGraphics();

        // construct two Point objects, one at (400, 200) and one at (400, 300)
        Point p1 = new Point(400, 200);
        Point p2 = new Point(400, 300);

        // LOOKING AHEAD! - construct an array of 3 points
        Point[] points = new Point[3];
        points[0] = new Point(200, 450); // instantiate new point for index 0
        points[1] = new Point(300, 450); // instantiate new point for index 1
        points[2] = new Point(400, 450); // instantiate new point for index 2

        // LOOKING AHEAD! - construct an array of 5 points (using an initializer list)
        Point[] points2 = { new Point(100, 150),
                new Point(200, 150),
                new Point(300, 150),
                new Point(400, 150),
                new Point(500, 150) };

        // Draw Point p1
        g.fillOval(p1.x, p1.y, 3, 3);
        g.drawString("(" + p1.x + ", " + p1.y + ")", p1.x, p1.y);

        // Draw Point p2
        g.fillOval(p2.x, p2.y, 3, 3);
        g.drawString("(" + p2.x + ", " + p2.y + ")", p2.x, p2.y);

        // LOOKING AHEAD! - Draw Array of Points (points) with a normal for loop
        for (int i = 0; i < points.length; i++) {
            g.fillOval(points[i].x, points[i].y, 3, 3);
            g.drawString("(" + points[i].x + ", " + points[i].y + ")", points[i].x, points[i].y);
        }

        // LOOKING AHEAD! - Draw Array of Points (points2) with enhanced for loop
        for (Point p : points2) {
            g.fillOval(p.x, p.y, 3, 3);
            g.drawString("(" + p.x + ", " + p.y + ")", p.x, p.y);
        }

        // display the two Point objects' state
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);

        // display p1 distance from origin
        System.out.println("p1's distance from origin is " + p1.distance(new Point()));

        // translate p1 to (450, 250)
        p1.translate(50, 50);

        // translate p2 to (350, 250)
        p2.translate(-50, -50);

        // display the two Point objects' state again
        System.out.println("p1 is now " + p1);
        System.out.println("p2 is now " + p2);
    }
}
