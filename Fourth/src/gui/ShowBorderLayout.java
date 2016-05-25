package gui;

import java.awt.BorderLayout;
import javax.swing.*;

public class ShowBorderLayout extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public ShowBorderLayout(){
		
		this.setLayout(new BorderLayout(10, 10));
		
		this.add(new JButton("North"), BorderLayout.NORTH);
		this.add(new JButton("West"), BorderLayout.WEST);
		this.add(new JButton("Center"), BorderLayout.CENTER);
		this.add(new JButton("East"), BorderLayout.EAST);
		this.add(new JButton("South"), BorderLayout.SOUTH);
		
	}

}
