package math;

public class QuadraticEquation {
	
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation(){
		
		a = 1;
		b = 1;
		c = 1;
	}
	
	public QuadraticEquation(double a, double b, double c){
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getA(){
		
		return a;
	}
	
	public double getB(){
		
		return b;
	}
	
	public double getC(){
		
		return c;
	}
	
	private double getDiscriminant(){
						
		return Math.pow(b, 2) - (4 * a * c);
	}
	
	public boolean isSolution(){
		
		if(getDiscriminant() < 0){
			return false;
		}
		else{
			return true;
		}
	}
	
	public double getRoot1(){
		
		if(isSolution()){
			return (-b + Math.cbrt(getDiscriminant())) / 2  * a;
		}
		else{
			return 0;
		}
	}
	
	public double getRoot2(){
		
		if(isSolution()){
			return (-b - Math.cbrt(getDiscriminant())) / 2  * a;
		}
		else{
			return 0;
		}
	}
		
	public String toString(){
		
		String string = a + "x2" + " + " + b + "x" + " + " + c + "  ";
		
		if(!isSolution()){
			string += " has not real solution";
		}
		else{
			if(getRoot1() == getRoot2()){
				string += " has one solution: " + getRoot1();
			}
			else{
				string += " has two solutions: Root 1: " +  getRoot1() + " Root 2: " + getRoot2();
			}
		}
		return string;
	}
	
}
