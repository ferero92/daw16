package geometricShapes;

public class Rectangle {
	
	private double side1;
	private double side2;
	
	public Rectangle() {
		
		side1 = 1.0;
		side2 = 2.0;
	}
	
	public Rectangle(double newSide1, double newSide2) {
		
		side1 = newSide1;
		side2 = newSide2;
	}
	
	public double getArea() {
		
		return side1 * side2;
	}
	
	public double getPeri() {
		
		return (side1 * 2) + (side2 * 2);
	}
	
}
