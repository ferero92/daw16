package test;

import geometric.*;
import java.util.Arrays;
import java.lang.ClassCastException;

public class Example {

	public static void main(String[] args) {
		
		Circle[] circles = {new Circle(2), new Circle(8), new Circle(4)};
		
		try {
			Arrays.sort(circles);				
		
			for(Circle circle: circles){
				System.out.println(circle);
			}
		
		}
		catch (ClassCastException e) {
			System.out.println("Falta implementar el comparable");
		}
		
	}
	
}
