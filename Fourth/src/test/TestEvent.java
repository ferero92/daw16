package test;

import gui.EventLayout;

public class TestEvent {
	
	public static void main(String[] args) {
		
		EventLayout frame = new EventLayout();
		
		frame.setTitle("Hello everyone");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EventLayout.EXIT_ON_CLOSE);
		
	}

}
