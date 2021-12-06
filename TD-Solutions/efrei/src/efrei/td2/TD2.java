package efrei.td2;

import java.util.Scanner;

public class TD2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Point a = Point.readPoint(scanner, "A");
		Point b = Point.readPoint(scanner, "B");
		Point c = Point.readPoint(scanner, "C");
		Point d = Point.readPoint(scanner, "D");
		System.out.println(String.format("%s\n%s\n%s\n%s", a.toString(), b, c, d));
		System.out.println("Distance entre point A et point B: " + Point.distanceEntreDeuxPoints(a, b));
		System.out.println("Distance entre point C et point D: " + c.distanceA(d));
		System.out.println("Ces 4 points forment-ils un Rectangle? "
				+ (Point.isRectangle(a, b, c, d) || Point.isRectangle(a, b, d, c) || Point.isRectangle(a, c, b, d)));
		scanner.close();
	}
}
