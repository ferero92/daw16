package geometric;

public class Circle extends GeometricObject {

		private double radius;
		
		public Circle(){
			
			super();
		}
		
		public Circle(double radius){
			
			super();
			this.radius = radius;
		}
		
		public Circle (double radius, String color, boolean filled){
			
			super(color, filled);
			this.radius = radius;
		}
		
		public double getRadius(){
			
			return this.radius;
		}
		
		public void setRadius(double radius){
			
			this.radius = radius;
		}
		
		public double getDiameter(){
			
			return (radius * 2);
		}
		
		public double getArea(){
			
			return (radius * radius * Math.PI);
		}
		
		public boolean equals(Object o){
			
			if(o instanceof Circle){
				
				return this.radius == ((Circle)o).getRadius();
			}
			else{
				return false;
			}
		}
		
		public String toString(){
		
			return "Circle of radius " + this.radius + super.toString();
		}
		
}
