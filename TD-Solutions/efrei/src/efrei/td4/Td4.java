package efrei.td4;

import efrei.td2.Point;

public class Td4 {
	public static void main(String[] args) {
//		Square[] squares = { new Square(2), new Square(3), new Square(4), new Square(5) };
//		for (int i = 0; i < squares.length; i++) {
//			Square s = squares[i];
//			System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", s, s.surface(), s.perimeter()));
//		}
		IShape2D[] shapes = { new Circle(new Point(3,4), 2), new Square(2), new Rectangle(2,3), new Rectangle(3,4), new Rectangle(4,5), new Rectangle(5,6) };
		for (int i = 0; i < shapes.length; i++) {
			IShape2D s = shapes[i];
			if(s instanceof Rectangle) {
				System.out.println("Rectangle");
			}
			if(s instanceof Square) {
				System.out.println("Carré");
			}
			System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", s, s.surface(), s.perimeter()));
		}
		for (IShape2D s : shapes) {
			if(s instanceof Rectangle) {
				System.out.println("Rectangle");
			}
			if(s instanceof Square) {
				System.out.println("Carré");
			}
			System.out.println(String.format("%s\tAire:%,.2f\tPerimètre:%,.2f", s, s.surface(), s.perimeter()));
		}
	}
}
