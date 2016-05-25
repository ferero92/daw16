package gui;

import java.awt.*;
import javax.swing.*;
import graphics.FigurePanel;

public class FigurePanelLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	protected static final int NUMBER_OF_FIGURES = 6;

	public FigurePanelLayout(){
	
		this.setLayout(new GridLayout(2,3));
				
		for(int i = 0; i < NUMBER_OF_FIGURES; i++)
			this.add(new FigurePanel());
	}

}
