package test;

import objects.DNI;

public class TestDNI {

	public static void main(String[] args) {
		
		DNI me = new DNI();
		
		System.out.println("DNI:" + me);
		
		DNI you = new DNI(47773750);
		
		System.out.println("DNI:" + you);
		
		DNI him = new DNI(29613092, 'h');
		
		System.out.println(him.isLetter());

	}

}
