package view;

import java.awt.*;
import javax.swing.*;

public class TheMan extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final int NEUTRO = 0;
	public static final int RIGHT = 1;
	public static final int LEFT = 2;
	
	private int fails;
	private Points points;
	private int position;
	
	public TheMan(int fails){		
		this.fails = fails;
		this.points = new Points();
		this.position = NEUTRO;
	}
	
	public TheMan(int fails, int position){
		this.fails = fails;
		this.points = new Points();
		this.position = position;
	}
	
	public int getFails(){		
		return this.fails;
	}
	
	public Points getPoints() {
		return points;
	}

	public void setPoints(Points points) {
		this.points = points;
	}

	@Override
	public void paintComponent(Graphics g){		
		super.paintComponent(g);
				
		int n = Points.GALLOWS;
		
		if(this.fails > 0){
			n += Points.HEAD;
		}
		if(this.fails > 1){
			for(int i = 0; i < this.fails; i++){
				if(i < 2)
					n++;
				else
					n += 2;
			}
		}
		switch (position) {
		case NEUTRO:
			g.drawPolyline(this.points.getX(), this.points.getY(), n);
			break;
		case RIGHT:
			g.drawPolyline(this.points.getRx(), this.points.getRy(), n);
			break;
		case LEFT:
			g.drawPolyline(this.points.getLx(), this.points.getLy(), n);
			break;
		}
		
	}
	
	

}
