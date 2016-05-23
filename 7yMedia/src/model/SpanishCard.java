package model;

public class SpanishCard {
	
	private int value;
	private int suit;
	private String image;
	
	public SpanishCard(int value, int suit){
		
		this.value = value;
		this.suit = suit;
		this.image = new String("baraja/" + this.suit + "c" + this.value + ".jpg");
	}

	public int getValue() {
		
		return value;
	}

	public int getSuit() {
		
		return suit;
	}

	public String getImage() {
		
		return image;
	}

	@Override
	public String toString(){
		
		String string = new String();
		
		switch (this.value) {
		case 0:	string += "As de ";			
			break;
		case 7: string += "Sota de ";
			break;
		case 8: string += "Caballo de ";
			break;
		case 9: string += "Rey de ";
			break;
		default:string += (this.value +1) + " de ";
			break;
		}
		switch (this.suit) {
		case 0:	string += "oros";
			break;
		case 1:	string += "copas";
			break;
		case 2: string += "espadas";
			break;
		case 3:	string += "bastos";
			break;
		}
		return string;
	}
	
}
