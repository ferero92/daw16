package gui;

import java.awt.*;
import javax.swing.*;
import graphics.MessagePanel;

public class MessageLayout extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public MessageLayout(){
		this.setLayout(new GridLayout(2, 2));		
		
		MessagePanel m1 = new MessagePanel();
		m1.setBackground(Color.GREEN);
		this.add(m1);
		
		MessagePanel m2 = new MessagePanel("Java is fun", MessagePanel.UP);
		m2.setBackground(Color.GRAY);
		this.add(m2);
		
		MessagePanel m3 = new MessagePanel("Java is cool", MessagePanel.RIGHT);
		m3.setBackground(Color.CYAN);
		this.add(m3);
		
		MessagePanel m4 = new MessagePanel("Java is good", MessagePanel.DOWN);
		m4.setBackground(Color.RED);		
		this.add(m4);
		
	}

}
