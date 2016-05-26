package controller;

import java.awt.event.*;
import model.ComplexNumber;
import view.View;

public class Controller implements ActionListener{
	
	private ComplexNumber n;
	private ComplexNumber m;
	private View view;
	
	public Controller(View view){
		
		this.view = view;		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		this.n = new ComplexNumber(this.view.getN().getText());
		this.m = new ComplexNumber(this.view.getM().getText());
		
		if(event.getSource() == this.view.getSum())			
			this.view.getResult().setText(this.n.sum(this.m).toString());
		
		if(event.getSource() == this.view.getMinus())			
			this.view.getResult().setText(this.n.subtraction(this.m).toString());
		
		if(event.getSource() == this.view.getMultiplication())
			this.view.getResult().setText(this.n.multiplication(this.m).toString());
		
	}
	
	public void addActionListeners(){
		
		this.view.getSum().addActionListener(this);
		this.view.getMinus().addActionListener(this);
		this.view.getMultiplication().addActionListener(this);
	}

}
