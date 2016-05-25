package test;

import model.Model;
import view.View;
import controller.Controller;

public class TestBouncedBall {
	
	public static void main(String[] args) {
		
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		controller.addListeners();
		view.run();
		
	}

}
