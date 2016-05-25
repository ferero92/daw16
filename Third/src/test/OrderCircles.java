package test;

import geometricShapes.Circle;

public class OrderCircles {

	public static void main(String[] args) {
		
		final int NUMBER_OF_CIRCLES = 5;
		
		Circle[] circles = new Circle[NUMBER_OF_CIRCLES];
		
		for(int i = 0; i < circles.length; i++){
			
			circles[i] = aCircle();
		}
		
		bubble(circles);
		
		System.out.println(printArray(circles));

	}
	
	public static Circle aCircle(){
		
		Circle circle = new Circle(randomNumber());
		
		return circle;
	}
	
	public static double randomNumber(){
		
		double number = Math.random() * 10;
		
		return number;
	}
	
	public static void bubble(Circle[] array){//*********************************to order the values in an array
		
		for(int i = 0; i < array.length - 2; i++){						
			
			for(int j = array.length - 2; j >= i; j--){
				if(array[j].getArea() > array[j + 1].getArea()){
					
					Circle aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;					
				}
			}			
		}						
	}
	
	public static String printArray(Circle[] array){//********************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "\t";
		}
		return String;
	}

}
