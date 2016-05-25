package gui;

import javax.swing.*;
import graphics.Fan;

public class FanLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public FanLayout(){
		
		this.add(new Fan());
	}

}
