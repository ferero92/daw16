package test;

import model.OracleDB;
import view.View;
import controller.Controller;

public class TestDepartments {
	
	public static void main(String[] args) {
		
		OracleDB db = new OracleDB();
		View view = new View();
		Controller controller = new Controller(view);
		
		db.connect("hr", "hr");
		
		controller.addActionListeners();
		view.run();
		
	}

}
