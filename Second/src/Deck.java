import javax.swing.JOptionPane;
public class Deck {

	public static void main(String[] args) {
		
		final int CARD_LENGTH = 52;
		int[] cards = cards(CARD_LENGTH);		
		randomShufling(cards);
		
		int howMany = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Deck. How many cards do you want?", "Deck", JOptionPane.QUESTION_MESSAGE));
		
		JOptionPane.showMessageDialog(null, firstHand(cards, howMany), "Deck", JOptionPane.INFORMATION_MESSAGE);
		
		int menu = 0;
		int howAgain = 0;
		
		do{
			menu = doMenu();
			
			switch(menu){
				case 1: howAgain = howMany + 1;
						JOptionPane.showMessageDialog(null, againCards(cards, howMany, howAgain), "Deck", JOptionPane.INFORMATION_MESSAGE);
						howMany = howAgain;
					break;
				case 2: howAgain = howMany + Integer.parseInt(JOptionPane.showInputDialog(null, "How many cards do you want?", "Deck", JOptionPane.QUESTION_MESSAGE));
						JOptionPane.showMessageDialog(null, againCards(cards, howMany, howAgain), "Deck", JOptionPane.INFORMATION_MESSAGE);
						howMany = howAgain;
					break;
				case 3: randomShufling(cards);
						howMany = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Deck. How many cards do you want?", "Deck", JOptionPane.QUESTION_MESSAGE));
						JOptionPane.showMessageDialog(null, firstHand(cards, howMany), "Deck", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4: randomShufling(cards);
						blackJack(cards);
						menu = 5;
					break;
				case 5:JOptionPane.showMessageDialog(null, "Exit", "Deck", JOptionPane.INFORMATION_MESSAGE);
					break;
					default: JOptionPane.showMessageDialog(null, "Wrong anser. Input a valid value", "Deck", JOptionPane.WARNING_MESSAGE);
			}			
		}while(menu != 5);
		
	}
	
	public static int[] cards(final int CARD_LENGTH){		
		
		int[] cards = new int[CARD_LENGTH];
		int j = 0;
		
		for(int i = 0; i < cards.length; i++){
			
			cards[i] = j;
			j++;
		}						
		return cards;
	}
		
	public static String numberCard(int[] cards, int i){
		
		String String = "";
		
		int card = cards[i] % 13 + 1;
		
		switch(card){
		case 1:String = "Ace of" + suitsCard(cards, i);
			break;
		case 11:String = "Jack of" + suitsCard(cards, i);
			break;
		case 12:String = "Queen of" + suitsCard(cards, i);
			break;
		case 13:String = "King of" + suitsCard(cards, i);
			break;
			default:String = card + " of" + suitsCard(cards, i);
		}				
		return String;
	}
	
	public static String suitsCard(int[] cards, int i){
		
		String String = "";
		
		if(cards[i] < 13){			
			String = " spades";
		}
		else{
			if(cards[i] < 26){
				String = " hearts";
			}
			else{
				if(cards[i] < 39){
					String = " diamonds";
				}
				else{
					String = " clubs";
				}
			}
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
	
	public static String firstHand(int[] cards, int howMany){
		
		String String = "";
		
		for(int i = 0; i < howMany; i++){
			
			String += numberCard(cards, i) + "\n";			
		}
		return String;
	}
	
	public static int doMenu(){
		
		int option = Integer.parseInt(JOptionPane.showInputDialog(null,
				"1 = Take another card" + "\n" +
				"2 = Select how many cards take" + "\n" +
				"3 = Shufled again and take new cards" + "\n" +
				"4 = Play BlackJack" + "\n" +
				"5 = Exit",
				"Deck", JOptionPane.INFORMATION_MESSAGE));
		return option;
	}
	
	public static String againCards(int[] cards, int howMany, int howAgain){
		
		String String = "";
		
		if(howAgain > cards.length){
			
			String = "You can not take this number of cards. The deck has only " + (cards.length - howMany) + " cards.";
		}
		
		else{
			for(int i = howMany; i < howAgain; i++){
					
			String += numberCard(cards, i) + "\n";
			}
		}
		return String;
	}
	
	public static void blackJack(int[] cards){
		
		String String = "";
		int score = 0;
		int casinoScore = 0;
		int i;
		
		for(i = 0; i < 2; i++){
			
			String += numberCard(cards, i) + "\n";
			
			if(cards[i] % 13 + 1 > 10){
			
				score += 10;
			}
			else{
				score += cards[i] % 13 + 1;
			}
		}
		int option = JOptionPane.showConfirmDialog(null, String + "\n" + "Score: " + score + "\n" + "Continue?", "Player Time", JOptionPane.INFORMATION_MESSAGE);
		
		while(option == JOptionPane.YES_OPTION && score < 21){	
			
			i++;
				
			String += numberCard(cards, i) + "\n";
				
			if(cards[i] % 13 + 1 > 10){
				
				score += 10;
			}
			else{
				score += cards[i] % 13 + 1;
			}			
			option = JOptionPane.showConfirmDialog(null, String + "\n" + "Score: " + score + "\n" + "Continue?", "Player Time", JOptionPane.INFORMATION_MESSAGE);
		}
		if(score > 21){
			JOptionPane.showMessageDialog(null, "You lose!", "BlackJack", JOptionPane.INFORMATION_MESSAGE);
		}
		else{			
			String casinoString = "";
			do{
				i++;
				casinoString += numberCard(cards, i) + "\n";
				
				if(cards[i] % 13 + 1 > 10){
				
					casinoScore += 10;
				}
				else{
					casinoScore += cards[i] % 13 + 1;
				}
			}while(casinoScore < 17 || casinoScore == score);
			JOptionPane.showMessageDialog(null, casinoString + "\n" + "Casino Score: " + casinoScore + "\n" + "Continue?", "Casino Time", JOptionPane.INFORMATION_MESSAGE);
			
			if(casinoScore < score || casinoScore > 21){
				JOptionPane.showMessageDialog(null, "You win!", "BlackJack", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				JOptionPane.showMessageDialog(null, "Casino win!", "BlackJack", JOptionPane.INFORMATION_MESSAGE);
			}			
		}	
	}	
	
}
