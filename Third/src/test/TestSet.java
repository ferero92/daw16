package test;

import math.Set;

public class TestSet {

	public static void main(String[] args) {
		
		int[] datos = {1, 2, 3};
		int[] datos2 = {4, 5, 1, 6};
		
		Set c1 = new Set(datos);
		Set c2 = new Set(datos2);
		
		c1.addElement(4);
		c1.replaceElement(1, 5);
		Set c3 = c1.union(c2);		
		
		System.out.println(	c1.toString() + "\n" +
							c2.toString() + "\n" +
							c1.isBelongs(3) + "\n" +
							c3.toString());
	}

}
