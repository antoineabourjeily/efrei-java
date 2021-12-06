package efrei.td3;

//import java.text.MessageFormat;
import java.util.Scanner;

public class Rectangle {
	int length, width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public static Rectangle readRectangle(Scanner scanner) {
		System.out.println("Veuillez passer la longueur du rectangle");
		int length = scanner.nextInt();
		System.out.println("Veuillez passer la largeur du rectangle");
		int width = scanner.nextInt();
		return new Rectangle(length, width);
	}

	public double surface() {
		return this.length * this.width;
	}

	public double perimeter() {
		return 2 * (this.length + this.width);
	}
	
	@Override
	public String toString() {
//		return MessageFormat.format("Rectangle({0}x{1})", this.length, this.width);
		return String.format("Rectangle(%dx%d)", this.length, this.width);
	}
}
