package gui;

import javax.swing.*;
import java.awt.GridLayout;

public class ShowGridLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ShowGridLayout(){
		
		this.setLayout(new GridLayout(3, 2, 5, 5));
		
		this.add(new JLabel("First Name"));
		this.add(new JTextField());
		this.add(new JLabel("MI"));
		this.add(new JTextField());
		this.add(new JLabel("Last Name"));
		this.add(new JTextField());
		
	}

}
