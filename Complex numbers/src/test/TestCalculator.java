package test;

import view.View;
import controller.Controller;

public class TestCalculator {
	
	public static void main(String[] args) {
		
		View view = new View();
		Controller controller = new Controller(view);
		
		controller.addActionListeners();
		
		view.run();
		
	}

}
