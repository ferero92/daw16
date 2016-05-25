package listeners;

import java.awt.event.*;
import javax.swing.*;

public class MoneyEvent implements ActionListener{
	
	private static final double E = 166.386;
	
	private JTextField texto;
	private JLabel label;
	private JButton button;
	
	public MoneyEvent(JTextField texto, JLabel label, JButton button){
		this.texto = texto;
		this.label = label;
		this.button = button;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String string = new String();
		
		if(this.button.getText() == "a euros"){
			
			string += new String(	this.texto.getText() + " ptas son " + ((int)(
									Integer.parseInt(this.texto.getText()) / E * 100) / 100.0)
									+ "€.");
		}
		else{
			string += new String(	this.texto.getText() + " € son " + (int)(
									Integer.parseInt(this.texto.getText()) * E)
									+ " ptas.");
		}
		this.label.setText(string);		
	}

}
