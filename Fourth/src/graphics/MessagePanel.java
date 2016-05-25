package graphics;

import java.awt.*;
import javax.swing.*;

public class MessagePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public static final int CENTER = 0;
	public static final int UP = 1;
	public static final int RIGHT = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;
	
	private String message;
	private int position;
	
	public MessagePanel(){
		this("Welcome to Java");
	}
	
	public MessagePanel(String message){
		this.message = message;
	}
	
	public MessagePanel(String message, int position){
		
		this.message = message;
		this.position = position;
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		FontMetrics fm = g.getFontMetrics();
		
		int width = fm.stringWidth(this.message);
		int height = fm.getAscent();
		int x = this.getWidth() / 2 - width / 2;
		int y = this.getHeight() / 2 + height / 2;
		
		switch (this.position) {
		case UP: 	y = height;
			break;
		case RIGHT:	x = this.getWidth() - width;
			break;
		case DOWN:	y = this.getHeight() - height;
			break;
		case LEFT:	x = 0;
			break;
		}
		g.drawString(this.message, x, y);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

}
