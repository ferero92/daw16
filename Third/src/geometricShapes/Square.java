package geometricShapes;

public class Square {
	
	private double side;
	
	public Square() {
		
		side = 1.0;
	}
	
	public Square(double newSide) {
		
		side = newSide;
	}
	
	public double getSquare() {
		
		return side * side;
	}
	
	public double getPeri() {
		
		return side * 4;
	}
}
