package test;

import math.QuadraticEquation;
import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the values of a, b and c");
		
		System.out.print("Value for a:");
		int a = input.nextInt();
		
		System.out.print("Value for b:");
		int b = input.nextInt();
		
		System.out.print("Value for c:");
		int c = input.nextInt();
		
		QuadraticEquation qEquation = new QuadraticEquation(a, b, c);
		
		input.close();
		
		System.out.println(qEquation.toString());
	}

}
