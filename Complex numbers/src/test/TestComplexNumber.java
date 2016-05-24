package test;

import model.ComplexNumber;

public class TestComplexNumber {
	
	public static void main(String[] args) {
		
		ComplexNumber n = new ComplexNumber("(5+45i)");
		ComplexNumber m = new ComplexNumber("5+7i");
		
		System.out.println(n.getA());
		System.out.println(n.getB());
		System.out.println(n.getA() + n.getB());
		
		System.out.println(m.getA());
		System.out.println(m.getB());
		System.out.println(m.getA() - m.getB());
	
	}
}
