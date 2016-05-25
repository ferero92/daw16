package model;

import java.awt.*;
import javax.swing.*;

public class Model extends JPanel{

	private static final long serialVersionUID = 1L;
	private final int RADIUS = 50;
	private final int POSITION = 0;
	
	private int x;
	private int y;	
	
	public Model(){
		
		this.x = POSITION;
		this.y = POSITION;
		
	}
	
	public int getRADIUS() {
		return RADIUS;
	}

	@Override
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y, this.RADIUS, this.RADIUS);
		
	}

}
