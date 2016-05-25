package objects;

public class BMI {

	private String name;
	private int age;
	private double weight;
	private double height;
	private char gender;
	
	public BMI(){
		
		this("John", 20, 60.0, 1.70, 'M');
	}
	
	public BMI(double weight, double height){
		
		this.weight = weight;
		this.height = height;
	}
	
	public BMI(double weight, double height, char gender){
		
		this(weight, height);
		this.gender = gender;
	}
	
	public BMI(String name, int age, double weight, double height, char gender){
		
		this(weight, height, gender);
		this.name = name;
		this.age = age;		
	}
	
	public String getName(){
		
		return name;
	}
	
	public int getAge(){
		
		return age;
	}
	
	public double getWeight(){
		
		return weight;
	}
	
	public double getHeight(){
		
		return height;
	}
	
	public char getGender(){
		
		return gender;
	}
	
	public void setName(String name){
		
		this.name = name;
	}
	
	public void setAge(int age){
		
		this.age = age;
	}
	
	public void setWeight(double weight){
		
		this.weight = weight;
	}
	
	public void setHeight(double height){
		
		this.height = height;
	}
	
	public void setGender(char gender){
		
		this.gender = gender;
	}
	
	public double getBMI(){
		
		return (int) (this.weight / Math.pow(this.height, 2) * 10) / 10;
	}
		
}
