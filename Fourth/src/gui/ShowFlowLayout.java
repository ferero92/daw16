package gui;

import java.awt.FlowLayout;
import javax.swing.*;

public class ShowFlowLayout extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public ShowFlowLayout(){
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		this.add(new JLabel("First Name"));
		this.add(new JTextField(8));
		this.add(new JLabel("MI"));
		this.add(new JTextField(1));
		this.add(new JLabel("Last Name"));
		this.add(new JTextField(8));
		
	}

}
