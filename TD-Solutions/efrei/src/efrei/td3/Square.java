package efrei.td3;

import java.text.MessageFormat;
import java.util.Scanner;

public class Square {
	int side;
	
	public Square(int side){
		this.side = side;
	}
	
	public static Square readSquare(Scanner scanner) {
		System.out.println("Veuillez passer le côté du carré");
		int side= scanner.nextInt();
		return new Square(side);
	}
	
	public double surface() {
		return Math.pow(this.side, 2);
	}

	public double perimeter() {
		return 4 * this.side;
	}
	
	@Override
	public String toString() {
		return MessageFormat.format("Square({0}x{0})", this.side);
	}
}
