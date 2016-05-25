package view;

import java.awt.*;
import javax.swing.*;

public class Resolve extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	private JTextField txt;
	private JButton submit;
	
	public Resolve(){
		
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 25, 0));
		
		this.label = new JLabel("Resolve?");
		this.txt = new JTextField(20);
		this.submit = new JButton("Submit");
		
		this.add(this.label);
		this.add(this.txt);
		this.add(this.submit);
		
	}

	//Getters and Setters
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JTextField getTxt() {
		return txt;
	}

	public void setTxt(JTextField txt) {
		this.txt = txt;
	}

	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

}
