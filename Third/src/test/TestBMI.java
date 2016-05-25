package test;

import objects.StatusBMI;

public class TestBMI {

	public static void main(String[] args) {
				
		StatusBMI status = new StatusBMI(75.12, 1.8, 'M');
		
		System.out.println(	"Your BMI is: " + status.getBMI() + "\n" +
							"You are " + status.getStatus());

	}

}
