package geometric;

public class Rectangle extends GeometricObject {
	
	private double base = 2.0;
	private double height = 3.0;
	
	public Rectangle(){
			
		super();		
	}
	
	public Rectangle(double base, double height){
		
		super();
		this.base = base;
		this.height = height;
	}
	
	public Rectangle(double base, double height, String color, boolean filled){
		
		super(color, filled);
		this.base = base;
		this.height = height;
	}
	
	public double getBase(){
		
		return this.base;
	}
	
	public double getHeight(){
		
		return this.height;
	}
	
	public void setBase(double base){
		
		this.base = base;
	}
	
	public void setHeight(double height){
		
		this.height = height;
	}
	
	public double getPerimeter(){
		
		return (base * 2) + (height * 2);
	}
	
	public double getArea(){
		
		return (this.base * this.height);
	}
	
	public boolean equals(Object o){
		
		if(o instanceof Rectangle){
			
			return this.base == ((Rectangle)o).getBase() && this.height == ((Rectangle)o).getHeight();
		}
		else{			
			return false;
		}
	}
	
	public String toString(){
		
		return "Rectangle of base " + this.base + " and height " + this.height + super.toString();
	}

}
