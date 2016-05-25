
public class PickACard {

	public static void main(String[] args) {
		
		int cardnumber = (int)(Math.random() * 52 + 1);		
		int card = (cardnumber % 13);
		String cardstring = "";
		
		switch(card){
		case 0: cardstring = "King of";
			break;
		case 1:cardstring = "Ace of";
			break;
		case 11:cardstring = "Jack of";
			break;
		case 12: cardstring = "Queen of";
			break;		
			default: cardstring = card + " of";
		}		
		if(cardnumber <= 13){
			cardstring += " clubs";
		}
		else{
			if(cardnumber <= 26){
				cardstring += " diamonds";
			}
			else{
				if(cardnumber <= 39){
					cardstring += " hearts";
				}
				else{
					cardstring += " spades";
				}
			}
		}				
		System.out.println(cardstring);
	}
}