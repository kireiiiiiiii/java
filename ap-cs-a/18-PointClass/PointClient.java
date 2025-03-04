/*
CSE 142 Lab 8 (Modified)

This client program uses Point objects.
Expected output:

p1 is (8, 2)
p2 is (4, 3)
p1's distance from origin is 8.246211251235321
p1 is now (9, 4)
p2 is now (3, 13)

Objectives:
- Create a complete Point class for the PointClient program.
- Complete the TODOs below
*/
public class PointClient {
	public static void main(String[] args) {

		// Construct two Point objects, one at (8, 2) and one at (0, 0)

		Point p1 = new Point(8, 2);
		Point p2 = new Point();

		// Display the two Point objects' state
		System.out.println("p1 is " + p1);
		System.out.println("p2 is " + p2);

		// TODO: display p1 distance from origin
		System.out.println("p1's distance from origin is " /* Enter code here */);

		// TODO: translate p1 to (9, 4)


		// TODO: translate p2 to (3, 13)


		// TODO: display the two Point objects' state again
		System.out.println("p1 is now " /* Enter code here */);
		System.out.println("p2 is now " /* Enter code here */);
	}
}
