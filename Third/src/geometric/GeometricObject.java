package geometric;

import java.util.Date;

public abstract class GeometricObject {
	
	private String color;
	private boolean filled;	
	private Date dateCreated;
	
	public GeometricObject(){
		
		this("white", true);		
		this.dateCreated = new Date();
	}
	
	public GeometricObject(String color, boolean filled){
		
		this.dateCreated = new Date();
		this.color = color;
		this.filled = true;
	}
	
	public Date getDateCreated(){
		
		return this.dateCreated;
	}
	
	public boolean isFilled(){
		
		return this.filled;
	}
	
	public String getColor(){
		
		return this.color;
	}
	
	public abstract double getArea();
	
	public abstract boolean equals(Object o);
	
	public String toString(){
		
		return " with color " + this.color + " created " + this.dateCreated;
	}

}
