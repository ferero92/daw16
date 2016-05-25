package test;

import java.util.Scanner;
import geometricShapes.Circle;

public class TestCircle {

	public static void main(String[] args) {
		
		final int NUMBER_OF_OBJECTS = 5;
		Circle [] arrayCircle= createArray(NUMBER_OF_OBJECTS);
		int op;
		
		do{
			op=menu();
			switch(op){
				case 0:;
					break;
				case 1: newCircle(arrayCircle);
					break;
				case 2: print(arrayCircle);
					break;
				case 3: sort(arrayCircle);
					break;
				case 4:sumArea(arrayCircle);
			}
		}while (op!=0);
	}
	
	public static void sort(Circle[] array){
		for(int i = 0; i < Circle.getNumberOfCircles(); i++){
			
			for(int j = Circle.getNumberOfCircles() - 2; j >= i; j--){
				
				if(array[j+1].getArea()>array[j].getArea()){
					Circle aux = array[j+1];
					array[j+1]=array[j];
					array[j]=aux;
				}
			}
		}	 
	}
	
	public static void print(Circle[] array){
		
		System.out.println("Circles:");
		
		for (int i=0;i<Circle.getNumberOfCircles();i++){
			
			System.out.println(array[i].toString());
		}
	}
	
	public static int menu(){
		
		Scanner input = new Scanner(System.in);
		int op;
		System.out.println("Menu");
		System.out.println("1.- New circle");
		System.out.println("2.- Display");
		System.out.println("3.- Sort");
		System.out.println("4.- Sum area of all circles");
		System.out.println("0.- Exit");
		op= input.nextInt();
		
		input.close();
		
		return op;		
	}
	
	public static void newCircle(Circle[] array){
		
		Scanner input = new Scanner(System.in);
			System.out.println("Circle number :" + Circle.getNumberOfCircles() +"\n");
			System.out.println("Radius:");
			double r = input.nextDouble();
			System.out.println("Color:");			
			String color = input.next();
						
			array[Circle.getNumberOfCircles()] = new Circle(r,color);
			
			input.close();
	}
	
	public static double sumArea(Circle[] array){
		
		double sum = 0.0;
		
		for(int i = 0; i < Circle.getNumberOfCircles(); i++){
			
			sum += array[i].getArea();
		}
		return sum;
	}
	
	public static Circle[] createArray (int n){
		
		Circle[] array = new Circle[n];
	
		return array;		
	}

}
