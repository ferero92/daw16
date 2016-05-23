package controller;

import java.awt.event.*;

import javax.swing.JOptionPane;

import view.*;
import model.*;

public class Controller implements ActionListener{
	
	private View frame;
	private Model game;
	private Player[] players;
	private SpanishDeck deck;
	private boolean stop;
	private int turn;
	
	public Controller(Model game, View frame){
		
		this.frame = frame;
		this.game = game;
		this.players = this.game.getPlayers();
		this.deck = new SpanishDeck();
		this.turn = 0;
		this.stop = false;
		
		this.deck.shuffle();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		
		if(e.getSource() == this.frame.getPick()){
			
			SpanishCard card = this.deck.pickCard();
			
			switch (this.turn) {
			case 0:
				this.frame.getScreen1().addCard(card);
				this.game.score(this.players[this.turn], card);
				this.frame.getResult1().setText(this.players[this.turn].getResult() + " points");
				this.frame.paintAll(this.frame.getGraphics());
				if(!this.stop)
					this.turn++;
				break;
			case 1:
				this.frame.getScreen2().addCard(card);
				this.game.score(this.players[this.turn], card);
				this.frame.getResult2().setText(this.players[this.turn].getResult() + " points");
				this.frame.paintAll(this.frame.getGraphics());
				if(!this.stop)
					this.turn--;
				break;
			}
			
			if(this.players[0].getResult() > 7.5)
				JOptionPane.showMessageDialog(null, "Player 2 wins");
			else if(this.players[1].getResult() > 7.5)
				JOptionPane.showMessageDialog(null, "Player 1 wins");

		}
		else{
			
			this.stop = true;
			
		}
		
	}
	
	public void addListeners(){
		
		this.frame.getPick().addActionListener(this);
		this.frame.getStop().addActionListener(this);
		
	}
	
}
