import javax.swing.JOptionPane;
public class BlackJack {
	
	public static void main(String[] args) {
		
		final int NUMBER_OF_CARDS = 52;
		final int NUMBER_OF_PLAYERS = Integer.parseInt(JOptionPane.showInputDialog(null, "Number of players:", "BlackJack", JOptionPane.QUESTION_MESSAGE));
		int[] deck = pokerDeck(NUMBER_OF_CARDS);
		int top = 0;
		int[] score = new int[NUMBER_OF_PLAYERS];
		
		randomShufling(deck);
		
		for(int i = 0; i < ((top + 2) * NUMBER_OF_PLAYERS); i++){
			
			int player = 1;
			JOptionPane.showMessageDialog(null, "Player" + player + ":" + "\n" + nameCard(deck, top), "BlackJack", JOptionPane.INFORMATION_MESSAGE);
			player++;
			
			score[i] = blackJack(deck, top, i);
		}
		

	}
	
	public static int[] pokerDeck(int NUMBER_OF_CARDS){
		
		int[] deck = new int[NUMBER_OF_CARDS];
		
		for(int i = 0; i < deck.length; i++){
			
			deck[i] = i;
		}
		return deck;
	}
	
	public static String nameCard(int[] deck, int top){
		
		String String = "";
		String[] suit = {"spades", "hearts", "diamonds", "clubs"};
		String[] number = {"Ace of ", "Two of ", "Three of ", "Four of ", "Five of ", "Six of ", "Seven of ", "Eight of", "Nine of ", "Ten of ", "Jack of ", "Queen of ", "King of"}; 
		
		for(int i = 0; i < top; i++){
			
			String += number[deck[i] % 13] + suit[deck[i] /13] + "\n";
		}						
		return String;
	}
	
	public static void randomShufling(int[] array){
		
		for(int i = 0; i < array.length; i++){
						
			int aux;
			
			int n = (int)(Math.random()*array.length);
						
			aux = array[i];
			array[i] = array[n];
			array[n] = aux;
		}		
	}
	
	
	public static int blackJack(int[] deck, int top, int j){
		
		int score = 0;
		
		for(int i = 0; i < top; i++){
			
		}
		
		
		return score;
	}
	

}
