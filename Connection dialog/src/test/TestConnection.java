package test;

import model.Model;
import view.View;
import controller.Controller;

public class TestConnection {
	
	public static void main(String[] args) {
		
		Model model = new Model();		
		View view = new View();
		Controller controller = new Controller(model, view);
		
		controller.addActionListeners();
		
		view.run();
		
	}

}
