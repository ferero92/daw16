package geometricShapes;

public class Circle {
	
	private double radius;	
	private String color;
	private static int numberOfCircles;
	
	public Circle(){
		
		radius = 1.0;
		color = "white";
		numberOfCircles++;			
	}
	
	public Circle(double newRadius){
		
		radius = newRadius;		
		color = new String("white");
		numberOfCircles++;
	}
	
	public Circle(String newColor){
		
		radius = 1.0;		
		color = new String(newColor);
		numberOfCircles++;
	}
	
	public Circle(double newRadius, String newColor){
		
		radius = newRadius;
		color = new String(newColor);
		numberOfCircles++;
	}
	
	public boolean equals(Circle c){
		
		if(this.equalRadius(c) && this.equalColor(c)){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equalRadius(Circle c){
		
		if(this.radius == c.getRadius()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean equalColor(Circle c){
		
		if(this.color.equals(c.getColor())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public double getRadius(){
		
		return radius;
	}
	
	public String getColor(){
		
		return color;
	}
	
	public static int getNumberOfCircles(){
		
		return numberOfCircles;
	}
	
	public double getArea(){
		
		return radius * radius * Math.PI;
	}
	
	public double getPeri(){
		
		return radius * 2 * Math.PI;
	}
	
	public String toString(){
		
		return "Circle " + color + " with radius: " + radius;
	}
	
}
