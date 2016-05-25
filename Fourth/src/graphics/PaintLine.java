package graphics;

import java.awt.*;
import javax.swing.*;

public class PaintLine extends JPanel{

	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.drawLine(4, 4, 2000, 2000);
		
	}

}
