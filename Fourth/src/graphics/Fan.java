package graphics;

import java.awt.*;
import javax.swing.*;

public class Fan extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public Fan(){
		super();
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		
		g.drawArc(	(int)(0.1 * this.getWidth()), (int)(0.1 * this.getHeight()),
					(int)(0.8 * this.getWidth()), (int)(0.8 * this.getHeight()),
					0, 360);
		g.fillArc(	(int)(0.1 * this.getWidth()), (int)(0.1 * this.getHeight()),
					(int)(0.8 * this.getWidth()), (int)(0.8 * this.getHeight()),
					0, 30);
		g.fillArc(	(int)(0.1 * this.getWidth()), (int)(0.1 * this.getHeight()),
					(int)(0.8 * this.getWidth()), (int)(0.8 * this.getHeight()),
					90, 30);
		g.fillArc(	(int)(0.1 * this.getWidth()), (int)(0.1 * this.getHeight()),
					(int)(0.8 * this.getWidth()), (int)(0.8 * this.getHeight()),
					180, 30);
		g.fillArc(	(int)(0.1 * this.getWidth()), (int)(0.1 * this.getHeight()),
					(int)(0.8 * this.getWidth()), (int)(0.8 * this.getHeight()),
					270, 30);
	}

}
