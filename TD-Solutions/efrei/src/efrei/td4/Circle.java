package efrei.td4;

import efrei.td2.Point;

public class Circle implements IShape2D {

	Point center;
	int radius;

	public Circle(int x, int y, int radius) {
		this(new Point(x, y), radius);
	}

	public Circle(Point p, int radius) {
		this.center = p;
		this.radius = radius;
	}

	@Override
	public double surface() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		return String.format("Circle(%s, %d)", this.center, this.radius);
	}

}
