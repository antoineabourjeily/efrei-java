package efrei.td4;

public class Square extends Rectangle implements IShape2D {
	int side;
	
	public Square() {
		this(1);
	}
	
	public Square(int side) {
		super(side, side);
		this.side = side;
	}
	
	@Override
	public String toString() {
		return String.format("Square(%dx%d)", this.side, this.side);
	}
}