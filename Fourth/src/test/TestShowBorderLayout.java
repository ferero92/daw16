package test;

import java.awt.*;
import gui.ShowBorderLayout;

public class TestShowBorderLayout {
	
	public static void main(String[] args) {
		
		ShowBorderLayout frame = new ShowBorderLayout();
		Point p = new Point(500, 200);
		Dimension d = new Dimension(300, 300);
		final int EXIT = ShowBorderLayout.EXIT_ON_CLOSE;
		
		frame.setTitle("ShowBorderLayout");
		frame.setSize(d);
		frame.setLocation(p);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT);
		
	}

}
