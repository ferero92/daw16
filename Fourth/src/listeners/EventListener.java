package listeners;

import java.awt.event.*;
import javax.swing.*;

public class EventListener implements ActionListener{
	
	private JTextField txt;
	private JButton button;
	
	public EventListener(JTextField txt, JButton jbt){
		this.txt = txt;
		this.button = jbt;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.button.getText() == "OK"){
			this.txt.setText("Hello");
		}
		else{
			this.txt.setText("Bye");
		}
		
	}

}
