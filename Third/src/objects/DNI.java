package objects;

public class DNI {
	
	private int number;
	private char letter;
	
	public DNI(){
		
		this(11223344);
	}
	
	public DNI(int number){
		
		this.number = number;
		this.letter = calLetter();
	}
	
	public DNI(int number, char letter){
		
		this.number = number;
		this.letter = letter;
	}
	
	public int getNumber(){
		
		return this.number;
	}
	
	public char getLetter(){
		
		return this.letter;
	}
	
	public void setNumber(int number){
		
		this.number = number;
	}
	
	public void setLetter(char letter){
		
		this.letter = letter;
	}
	
	public char calLetter(){
		
		char[] check = new char[] {'t','r','w','a','g','m','y','f','p','d','x','b','n','j','z','s','q','v','h','l','c','k','e'};
		
		return check[number % check.length];		
	}
	
	public boolean isLetter(){
		
		if(this.letter == calLetter()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		
		return String.valueOf(number) + letter;
	}

}
