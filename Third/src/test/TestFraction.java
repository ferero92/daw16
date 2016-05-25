package test;

import math.Fraction;

public class TestFraction {

	public static void main(String[] args) {
		
		Fraction f1 = new Fraction(4,12);
		Fraction f2 = new Fraction(3,7);
		
		System.out.println(	f1 + "\n" + 
							f2 + "\n" + 
							f1.sum(f2) + "\n" + 
							f1.subtract(f2) + "\n" + 
							f1.multiply(f2) + "\n" + 
							f1.divide(f2));		
		
	}

}
