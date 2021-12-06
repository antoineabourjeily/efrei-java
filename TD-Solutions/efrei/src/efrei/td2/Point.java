package efrei.td2;

import java.util.Scanner;

public class Point {
	int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	public static Point readPoint(Scanner scanner, String s) {
		System.out.println(String.format("Veuillez passer les coordonnées du point %s (x y):", s));
		Point p = new Point();
		p.x = scanner.nextInt();
		p.y = scanner.nextInt();
		return p;
	}

	public static double distanceEntreDeuxPoints(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.y - p2.y, 2) + Math.pow(p1.x - p2.x, 2));
	}

	public double distanceA(Point p) {
		return Math.sqrt(Math.pow(this.y - p.y, 2) + Math.pow(this.x - p.x, 2));
	}

	public static boolean isRectangle(Point A, Point B, Point C, Point D) {
		double distanceAB = A.distanceA(B);
		double distanceCD = C.distanceA(D);
		return A.x == D.x && B.x == C.x && A.y == B.y && C.y == D.y && distanceAB == distanceCD;
	}

	public String toString() {
		return String.format("Point(%d, %d)", this.x, this.y);
	}
	
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		return this.x == p.x && this.y == p.y;
	}


}
