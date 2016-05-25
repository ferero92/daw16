package gui;

import java.awt.*;
import javax.swing.*;

public class ShowImageIcon extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private final int NUMBER_OF_IMAGES = 5;

	public ShowImageIcon(){
		
		this.setLayout(new FlowLayout());
		
		JPanel p1 = new JPanel();
		
		for(int i = 0; i < this.NUMBER_OF_IMAGES; i++){
			
			String string = new String("image/img" + i + ".jpg");
			
			p1.add(new JLabel(new ImageIcon(string)));
		}
		
		this.add(p1);
		
	}

}
