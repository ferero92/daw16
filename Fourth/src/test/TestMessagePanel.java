package test;

import gui.MessageLayout;

public class TestMessagePanel {

	public static void main(String[] args) {
		
		MessageLayout frame = new MessageLayout();
		
		frame.setSize(700, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(MessageLayout.EXIT_ON_CLOSE);

	}

}
