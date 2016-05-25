package view;

import java.awt.*;
import javax.swing.*;

public class Keyboard extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final int KEYS = 26;
	
	private JButton[] buttons;
	
	public Keyboard(){		
		
		this.setLayout(new GridLayout(3,9));
		
		this.buttons = new JButton[KEYS];
		
		Character c = new Character('a');
		
		for(int i = 0; i < KEYS; i++){
			this.buttons[i] = new JButton(c.toString());			
			this.add(this.buttons[i]);
			c++;			
		}
	}

	public JButton[] getButtons() {
		return buttons;
	}

	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}

}
