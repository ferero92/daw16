package controller;

import java.awt.event.*;
import view.View;

public class Controller implements ActionListener{

	private View view;
	
	public Controller(View view){
		
		this.view = view;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == this.view.getFirst().getSubmit()){
			this.view.runagain();
		}
		
	}
	
	public void addActionListeners(){
		
		this.view.getFirst().getSubmit().addActionListener(this);
	}

}
