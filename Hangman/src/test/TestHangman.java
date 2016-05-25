package test;

import model.Model;
import view.View;
import controller.Controller;
import java.io.IOException;

public class TestHangman {

	public static void main(String[] args) {
		
		Model model = null;
		
		try{
			model = new Model();
		}
		catch(IOException e){
		
		}
		View view = new View(model);
		Controller controller = new Controller(model, view);
		
		controller.addListeners();
		view.run();

	}

}
