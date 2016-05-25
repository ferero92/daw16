package controller;

import java.awt.event.*;
import javax.swing.*;
import model.Model;
import view.*;

public class Controller implements ActionListener{

	private Model model;
	private View view;
	private Timer timer;
	private int position;
	private boolean direction;
	private boolean death;
	
	public Controller(Model model, View view){
		
		this.model = model;
		this.view = view;
		this.timer = new Timer(500, this);
		this.position = 0;
		this.direction = true;
		this.death = false;
		
	}
		
	@Override
	public void actionPerformed(ActionEvent event) {
				
		if(event.getSource() == this.view.getSubmit()){
			
			if(this.view.getTxt().getText().equals(this.model.getWord()))
				this.result("win");
			else{
				this.model.setMistakes(6);
				this.view.updateMan(this.model.getMistakes());
				this.timer.start();
				this.death = true;
				this.result("lose");
			}
		}
		else if(event.getSource() instanceof JButton){
			
			JButton button = (JButton)event.getSource();			
			this.model.move(button.getText().charAt(0));
			button.setEnabled(false);
			this.view.updateMan(this.model.getMistakes());
			
			if(this.model.printMask().equals(this.model.getWord()))
				this.result("win");
			else if(this.model.getMistakes() == 6){
				this.timer.start();
				this.death = true;
				this.result("lose");
			}
		}
		if(this.death){
			switch (position) {
			case 0:
				this.view.move(TheMan.LEFT);
				this.position++;
				this.direction = true;
				break;
			case 1:
				this.view.move(TheMan.NEUTRO);
				if(this.direction)
					this.position++;
				else
					this.position--;
				break;
			case 2:
				this.view.move(TheMan.RIGHT);
				this.position--;
				this.direction = false;
				break;
			}
		}
		
	}
	
	public void addListeners(){
		
		for(int i = 0; i < Keyboard.KEYS; i++){
			
			this.view.getButtons()[i].addActionListener(this);			
		}		
		this.view.getSubmit().addActionListener(this);
		
	}
	
	public void result(String string){
		
		JOptionPane.showMessageDialog(null, "You " + string + ". The word was " + this.model.getWord());		
	}
	
}
