package efrei.td6;

import java.util.ArrayList;
import java.util.Iterator;

import efrei.td4.Circle;
import efrei.td4.IShape2D;
import efrei.td4.Rectangle;
import efrei.td4.Square;

public class TD6bis {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(5);
		arrList.add(1000);
		arrList.indexOf(5); // 2
		arrList.indexOf(4); // -1
//		if(arrList.contains(3))
//			
//			System.out.println(arrList.contains(4));

		ArrayList<IShape2D> shapeList = new ArrayList<>();
		shapeList.add(new Square(3));
		shapeList.add(new Rectangle(3, 4));
		shapeList.get(0); // arr[0]
		IShape2D[] shapes = (IShape2D[]) shapeList.toArray();
		shapeList.add(new Circle(3, 4, 5));
		shapes = (IShape2D[]) shapeList.toArray();
		
		Iterator<IShape2D> it = shapeList.iterator();
		while (it.hasNext()) {
			IShape2D iShape2D = (IShape2D) it.next();
			System.out.println(iShape2D);
		}
		
		for (IShape2D iShape2D : shapeList) {
			System.out.println(iShape2D);
		}

	}

	/*
	 * class LC { valeur, next }
	 * 
	 */
}
