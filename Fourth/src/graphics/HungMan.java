package graphics;

import java.awt.*;
import javax.swing.*;

public class HungMan extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private int fails;
	
	public HungMan(int fails){
		
		this.fails = fails;		
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		int width = this.getWidth();
		int height = this.getHeight();
		int[] xgallows = {120,70,170,120,120,350,350};
		int[] ygallows = {380,400,400,380,30,30,40};
		
		switch (this.fails) {
			case 0:	g.drawPolyline(xgallows, ygallows, xgallows.length);
				break;
			case 1:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
				break;
			case 2:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
					g.drawLine((int)(0.5 * width), (int)(0.32 * height), (int)(0.5 * width), (int)(0.6 * height));
				break;
			case 3:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
					g.drawLine((int)(0.5 * width), (int)(0.32 * height), (int)(0.5 * width), (int)(0.6 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.55 * width), (int)(0.55 * height));
				break;
			case 4:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
					g.drawLine((int)(0.5 * width), (int)(0.32 * height), (int)(0.5 * width), (int)(0.6 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.55 * width), (int)(0.55 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.45 * width), (int)(0.55 * height));
				break;
			case 5:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
					g.drawLine((int)(0.5 * width), (int)(0.32 * height), (int)(0.5 * width), (int)(0.6 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.55 * width), (int)(0.55 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.45 * width), (int)(0.55 * height));
					g.drawLine((int)(0.5 * width), (int)(0.6 * height), (int)(0.55 * width), (int)(0.75 * height));			
				break;
			case 6:	g.drawPolyline(xgallows, ygallows, xgallows.length);
					g.drawOval((int)(0.43 * width), (int)(0.1 * height), 100, 100);
					g.drawLine((int)(0.5 * width), (int)(0.32 * height), (int)(0.5 * width), (int)(0.6 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.55 * width), (int)(0.55 * height));
					g.drawLine((int)(0.5 * width), (int)(0.4 * height), (int)(0.45 * width), (int)(0.55 * height));
					g.drawLine((int)(0.5 * width), (int)(0.6 * height), (int)(0.55 * width), (int)(0.75 * height));
					g.drawLine((int)(0.5 * width), (int)(0.6 * height), (int)(0.45 * width), (int)(0.75 * height));
				break;
		}
	}
	
	public int getFails(){
		
		return this.fails;
	}

}
