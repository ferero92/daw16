package test;

import gui.FigurePanelLayout;

public class TestFigurePanel {

	public static void main(String[] args) {
		
		FigurePanelLayout frame = new FigurePanelLayout();
		
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(FigurePanelLayout.EXIT_ON_CLOSE);
		
	}

}
