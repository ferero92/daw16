package view;

import java.awt.*;
import javax.swing.*;
import model.SpanishCard;

public class CardView extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private SpanishCard card;
	private ImageIcon imageIcon;
	private Image image;
	
	public CardView(SpanishCard card){
		
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 75));
		this.card = card;
		this.imageIcon = new ImageIcon(this.card.getImage());
		this.image = this.imageIcon.getImage();
		
	}

	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		g.drawImage(this.image, 0, 0, 100, 139, this);
		
	}

}
