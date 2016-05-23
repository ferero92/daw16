package view;

import java.awt.*;
import javax.swing.*;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	
	private JButton pick;
	private JButton stop;
	private JPanel buttons;
	private JLabel result1;
	private JLabel result2;
	private JPanel screens;
	private CardScreen screen1;
	private CardScreen screen2;

	public View(){
		
		this.setLayout(new BorderLayout(10, 10));
		
		this.pick = new JButton("Pick a card");
		this.stop = new JButton("Stop");
		this.buttons = new JPanel();
		
		this.buttons.setLayout(new GridLayout(1, 2));
		this.buttons.add(this.pick);
		this.buttons.add(this.stop);
		
		this.result1 = new JLabel("0.0 points");
		this.result2 = new JLabel("0.0 points");
		
		this.screens = new JPanel();
		this.screens.setLayout(new GridLayout(1, 2));
		this.screen1 = new CardScreen("Player 1");
		this.screen2 = new CardScreen("Player 2");
		this.screens.add(this.screen1);
		this.screens.add(this.screen2);
		
		this.add(this.result1, BorderLayout.WEST);
		this.add(this.result2, BorderLayout.EAST);
		this.add(this.buttons, BorderLayout.SOUTH);
		this.add(this.screens);
		
	}

	public JButton getPick() {
		return pick;
	}

	public JButton getStop() {
		return stop;
	}

	public JLabel getResult1() {
		return result1;
	}

	public void setResult1(JLabel result1) {
		this.result1 = result1;
	}

	public JLabel getResult2() {
		return result2;
	}

	public void setResult2(JLabel result2) {
		this.result2 = result2;
	}

	public JPanel getScreens() {
		return screens;
	}

	public void setScreens(JPanel screens) {
		this.screens = screens;
	}

	public CardScreen getScreen1() {
		return screen1;
	}

	public void setScreen1(CardScreen screen1) {
		this.screen1 = screen1;
	}

	public CardScreen getScreen2() {
		return screen2;
	}

	public void setScreen2(CardScreen screen2) {
		this.screen2 = screen2;
	}

	public void run(){
		this.setTitle("7 y media");
		this.setSize(700, 500);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
