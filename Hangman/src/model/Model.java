package model;

import java.io.IOException;

import model.Dictionary;

public class Model {
	
	private String word;
	private char[] mask;
	private String introduced;
	private int mistakes;
	
	public Model() throws IOException{
		
		this(new Dictionary((int)(Math.random() * 4) +1).getRandomDictionary());
	}
	
	public Model(int language) throws IOException{
		
		this(new Dictionary(language).getRandomDictionary());
	}
	
	public Model(String word){
		
		this.word = word;
		this.mask = createMask();
		this.introduced = new String();
		this.mistakes = 0;
	}
	
	public String getWord(){
		
		return this.word;
	}
	
	public void setWord(String word){
		
		this.word = word;
	}
	
	public char[] getMask(){
		
		return mask;
	}
	
	public void setMask(char let){
		
		for(int i = 0; i < this.word.length(); i++){
			
			if(this.word.charAt(i) == let){
				
				this.mask[i] = let;
			}			
		}
	}
	
	public String getIntroduced(){
		
		return this.introduced;
	}
	
	public void setIntroduced(char let){
		
		this.introduced += let + " ";
	}
	
	public int getMistakes(){
		
		return this.mistakes;
	}
	
	public void setMistakes(int mistakes){
		
		this.mistakes = mistakes;
	}
	
	private char[] createMask(){
		
		char[] mask = new char[this.word.length()];
		
		for(int i = 0; i < this.word.length(); i++){
			
			mask[i] = '*';
		}
		return mask;
	}
	
	public String printMask(){
		
		String string = new String();
		
		for(int i = 0; i < this.mask.length; i++){
			
			string += this.mask[i];
		}
		return string;
	}
	
	public boolean checkLetter(char let){
		
		if(this.word.indexOf(let) == -1){
			
			return false;
		}
		else{
			return true;
		}
	}
	
	public void move(char let){
		
		this.setIntroduced(let);
		
		if(this.checkLetter(let)){
			
			this.setMask(let);
		}
		else{
			this.mistakes++;
		}
	}
	
	public String toString(){
		
		return 	"Word: " + this.word + "\n" +
				"Mask: " + this.printMask() + "\n" +
				"Introduced: " + this.introduced.toString() + "\n" +
				"Mistakes: " + this.mistakes;
	}

}
