package test;

import gui.ShowImageIcon;

public class TestShowImageIcon {

	public static void main(String[] args) {
		
		ShowImageIcon frame = new ShowImageIcon();
		
		frame.setTitle("Show Image Icon");
		frame.setSize(650, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(ShowImageIcon.EXIT_ON_CLOSE);
		
	}

}
