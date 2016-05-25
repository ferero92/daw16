package graphics;

import java.awt.*;
import javax.swing.*;

public class FigurePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final int LINE = 1;
	public static final int RECTANGLE = 2;
	public static final int ROUND_RECTANGLE = 3;
	public static final int OVAL = 4;
	
	private int type;
	private boolean filled = false;
	
	public FigurePanel(){
		
		this((int)(Math.random() * 4) +1);
	}
	
	public FigurePanel(int type){
		
		this.type = type;
	}
	
	public FigurePanel(int type, boolean filled){
		
		this(type);
		this.filled = filled;
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		int width = this.getWidth();
		int height = this.getHeight();
		
		switch (this.type) {
			case LINE:				
				g.drawLine(10, 10, width - 10, height - 10);
				g.drawLine(width - 10, 10, 10, height - 10);
				break;
			case RECTANGLE:
				if(this.filled){
					g.setColor(Color.BLUE);
					g.fillRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
				}
				else{
					g.drawRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
				}
				break;
			case ROUND_RECTANGLE:
				if(this.filled){
					g.setColor(Color.GREEN);
					g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height), 20, 20);
				}
				else{
					g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height), 20, 20);
				}
				break;
			case OVAL:
				if(this.filled){
					g.setColor(Color.RED);
					g.fillOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
				}
				else{
					g.drawOval((int)(0.1 * width), (int)(0.1 * height), (int)(0.8 * width), (int)(0.8 * height));
				}
				break;
		}
	}
	
	public int getType(){
		
		return this.type;
	}
	
	public void setType(int type){
		
		this.type = type;
	}
	
	public boolean isFilled(){
		
		return this.filled;
	}
	
	public void setFilled(boolean filled){
		
		this.filled = filled;
	}
		
}
