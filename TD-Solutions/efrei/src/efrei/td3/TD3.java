package efrei.td3;

import java.util.Scanner;
import efrei.td2.Point;

public class TD3 {

	public static void partie1() {
		Scanner scanner = new Scanner(System.in);
		Square s = Square.readSquare(scanner);
		Rectangle r = Rectangle.readRectangle(scanner);
		Circle c = Circle.readCircle(scanner);
		System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", s, s.surface(), s.perimeter()));
		System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", r, r.surface(), r.perimeter()));
		System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", c, c.surface(), c.perimeter()));
		scanner.close();
	}

	public static void partie2() {
		Point p1 = new Point(6,5);
		Point p2 = new Point(6,5);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		
		Circle c1 = new Circle(p1, 3);
		Circle c2 = new Circle(p2, 5);
		System.out.println(Circle.coCentric(c1, c2));
	}
	
	public static void partie3() {
		Circle c1 = new Circle(new Point(1, 3), 1);
		Circle c2 = new Circle(new Point(6, 5), 2);
		Circle c3 = new Circle(new Point(6, 5), 5);

		System.out.println(String.format("C1 intersects with C2? %s", c1.doesIntersectswith(c2)));
		System.out.println(String.format("C1 intersects with C3? %s", c1.doesIntersectswith(c3)));
		System.out.println(String.format("C2 intersects with C3? %s", c2.doesIntersectswith(c3)));
}

	public static void main(String[] args) {
		partie3();
	}
}
