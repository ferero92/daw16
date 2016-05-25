package gui;

import java.awt.*;
import javax.swing.*;

public class Microwave extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public Microwave(){
		
		this.setLayout(new GridLayout(1, 2));
		
		JPanel p1 = new JPanel(new BorderLayout());
		p1.add(new JButton("Food to be placed here"));
		
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
		
		JPanel p3 = new JPanel(new GridLayout(4, 3));
		
		for(int i = 0; i < 12; i++){
			
			String string = null;
			
			switch (i) {
				case 9:string = "0";				
					break;
				case 10:string = "Start";
					break;
				case 11:string = "Stop";
					break;
				default:string = (i + 1) + "";
					break;
			}
			JButton button = new JButton(string);
			p3.add(button);
		}
		p2.add(p3, BorderLayout.CENTER);
		
		this.add(p1);
		this.add(p2);
		
	}

}
