package test;

import gui.Microwave;

public class TestMicrowave {

	public static void main(String[] args) {
	
		Microwave frame = new Microwave();
		
		frame.setTitle("The Front View of a Microwave Oven");
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(Microwave.EXIT_ON_CLOSE);
		
	}

}
