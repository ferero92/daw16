package view;

import java.awt.*;
import javax.swing.*;
import model.SpanishCard;

public class CardScreen extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JPanel title;
	private JPanel panel;
	private JLabel name;
	
	public CardScreen(String name){
		
		this.setLayout(new BorderLayout());
		
		this.title = new JPanel();
		this.title.setLayout(new FlowLayout(FlowLayout.CENTER));
		this.name = new JLabel(name);
		this.title.add(this.name);
		this.panel = new JPanel();
		this.panel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		this.add(this.title, BorderLayout.NORTH);
		this.add(this.panel);
	
	}

	public JPanel getTitle() {
		return title;
	}

	public void setTitle(JPanel title) {
		this.title = title;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}
	
	public void addCard(SpanishCard card){
		
		this.panel.add(new CardView(card));
	}

}
