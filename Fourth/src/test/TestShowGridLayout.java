package test;

import java.awt.Dimension;
import gui.ShowGridLayout;

public class TestShowGridLayout {
	
	public static void main(String[] args) {
		
		ShowGridLayout frame = new ShowGridLayout();
		Dimension d = new Dimension(200, 200);
		final int EXIT = ShowGridLayout.EXIT_ON_CLOSE;
		
		frame.setTitle("ShowGridLayout");
		frame.setSize(d);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT);
		
	}

}
