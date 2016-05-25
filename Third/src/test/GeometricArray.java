package test;

import geometric.*;
import javax.swing.JOptionPane;

public class GeometricArray {

	public static void main(String[] args) {

		int NUMBER_OF_OBJECTS = 5;
		GeometricObject[] array = new GeometricObject[NUMBER_OF_OBJECTS];
		int index = 0;
		int menu = 0;

		do{
			menu = doMenu();
			switch (menu) {
				case 0: break;
				case 1:	if(index < array.length){
							addElement(array, index);
							index++;
						}
						else{
							JOptionPane.showMessageDialog(null, "You can not create more elements");
						}
					break;
				case 2:JOptionPane.showMessageDialog(null, printArray(array, index));
			}
		}while(menu != 0);

	}

	public static int doMenu(){

		return Integer.parseInt(JOptionPane.showInputDialog(null,
							"Please select an option:\n" +
							"1. Add Element\n" +
							"2. Print Array\n" +
							"0. Exit"));
	}

	public static void addElement(GeometricObject[] array, int index){

		int menu = 0;

		menu = menuCreate();
		switch (menu) {
			case 1: createCircle(array, index);
				break;
			case 2: createRectangle(array, index);
		}
	}

	public static int menuCreate(){

		return Integer.parseInt(JOptionPane.showInputDialog(null,
							"What do you want to create?\n" +
							"1. Circle\n" +
							"2. Rectangle"));
	}

	public static void createCircle(GeometricObject[] array, int index){

		double radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Radius?"));
		String color = JOptionPane.showInputDialog(null, "Color?");

		array[index] = new Circle(radius, color, true);
	}

	public static void createRectangle(GeometricObject[] array, int index){

		double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Base?"));
		double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Height?"));
		String color = JOptionPane.showInputDialog(null, "Color?");

		array[index] = new Rectangle(base, height, color, true);
	}

	public static String printArray(GeometricObject[] array, int index){

		String string = "";

		for(int i = 0; i < index; i++){
						
			string += array[i].toString() + ", with area " + array[i].getArea();

			if(array[i] instanceof Circle){
				
				string += " and its diameter is " + ((Circle)array[i]).getDiameter();
			}
			else{
				string += " and its perimeter is " + ((Rectangle)array[i]).getPerimeter();
			}
			string += "\n";
		}
		return string;
	}

}
