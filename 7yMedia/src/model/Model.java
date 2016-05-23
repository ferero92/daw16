package model;

public class Model {
	
	private int number;
	private Player[] players;
	
	public Model(){
		
		this.number = 2;
		this.players = new Player[this.number];
		
		for(int i = 0; i < this.number; i++){
			this.players[i] = new Player();
		}
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	public void score(Player player, SpanishCard card){
		
		double result = player.getResult();
		
		if(card.getValue() > 6){
			result += 0.5;
			player.setResult(result);
		}
		else{
			result += card.getValue() +1;
			player.setResult(result);
		}
		
	}
	

}
