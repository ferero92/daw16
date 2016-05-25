package controller;

import java.awt.event.*;
import javax.swing.*;
import model.Model;
import view.View;

public class Controller implements ActionListener{
	
	private Model model;
	private View view;
	private int x;
	private int y;
	private boolean bX;
	private boolean bY;
	private Timer timer;
	
	public Controller(Model model, View view){
		
		this.model = model;
		this.view = view;
		this.x = this.model.getX();
		this.y = this.model.getY();
		this.bX = false;
		this.bY = false;
		this.timer = new Timer(50, this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == this.view.getStart())
			this.timer.start();
		
		if(e.getSource() == this.view.getStop())
			this.timer.stop();
		
		if(this.x < this.view.getWidth() / 2 - this.model.getRADIUS() / 2 && !bX){			
			this.x += 5;			
		}
		else if(this.x > 0){
			this.x -= 5;
			this.bX = true;
		}
		else{
			this.bX = false;
		}
		
		if(this.y < this.view.getHeight() / 2 - this.model.getRADIUS() && !bY){
			this.y += 3;
		}
		else if(this.y > 0){
			this.y -= 3;
			this.bY = true;
		}
		else{
			this.bY = false;
		}
		
		this.model.setX(this.x);
		this.model.setY(this.y);
		
		this.view.setModel(this.model);
		
		this.view.paintAll(this.view.getGraphics());
		
		
	}
	
	public void addListeners(){
		
		this.view.getStart().addActionListener(this);
		this.view.getStop().addActionListener(this);
		
	}
		

}
