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
		
		int a = this.n.getA();
		int b = this.n.getB();
		int c = this.m.getA();
		int d = this.m.getB();
		
		if(event.getSource() == this.view.getSum())			
			this.view.getResult().setText("(" + (a+c) + "+" + (b+d) + "i)");
		
		if(event.getSource() == this.view.getMinus())			
			this.view.getResult().setText("(" + (a-c) + "+" + (b-d) + "i)");
		
		if(event.getSource() == this.view.getMultiplication())
			this.view.getResult().setText("(" + (a*c - b*d) + "+" + (a*d + b*c) + "i)");
		
	}
	
	public void addActionListeners(){
		
		this.view.getSum().addActionListener(this);
		this.view.getMinus().addActionListener(this);
		this.view.getMultiplication().addActionListener(this);
	}

}
