package efrei.td3;

import java.util.Scanner;

import efrei.td2.Point;

public class Circle {
	Point center;
	int radius;

	public Circle(Point p, int radius) {
		this.center = p;
		this.radius = radius;
	}

	public static Circle readCircle(Scanner scanner) {
		System.out.println("Veuillez passer le rayon du cercle");
		int radius = scanner.nextInt();
		Point p = Point.readPoint(scanner, "centre du cercle");
		return new Circle (p, radius);
	}

	public double surface() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}
	
	public static boolean coCentric(Circle c1, Circle c2) {
		return c1.center.equals(c2.center);
	}
	
	public boolean doesIntersectswith(Circle otherCircle) {
		double distance = this.center.distanceA(otherCircle.center);
		double sumRadius = this.radius + otherCircle.radius;
		return Circle.coCentric(this, otherCircle) && distance <= sumRadius;
	}
	
	@Override
	public String toString() {
		return String.format("Circle(%s, %d)", this.center, this.radius);
	}
}
