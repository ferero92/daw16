package model;

public class SpanishDeck {
	
	private final int NUMBER_OF_CARDS = 40;
	private int top = 0;
	private SpanishCard[] cards = new SpanishCard[NUMBER_OF_CARDS];
	
	public SpanishDeck(){
		
		for(int i = 0; i < NUMBER_OF_CARDS; i++){
			
			int value = i % 10;
			int suit = i / 10;
			
			this.cards[i] = new SpanishCard(value, suit);
		}
	}
	
	public void shuffle(){
		
		for(int i = 0; i < NUMBER_OF_CARDS; i++){
			int n = (int)(Math.random() * NUMBER_OF_CARDS);			
			SpanishCard aux = this.cards[i];
			this.cards[i] = this.cards[n];
			this.cards[n] = aux;
		}
	}

	public int getTop() {
		
		return top;
	}

	public SpanishCard pickCard(){
		
		SpanishCard card = this.cards[this.top];
		this.top++;
		return card;
	}

}
