package objects;

public class MyString {

	private String word;
	
	public MyString(String s){
		
		word = new String(s);
	}
	
	public String getWord(){
		
		return word;
	}
	
	public void setWord(String word){
		
		this.word = word;
	}
	
	public boolean isPalindrome(){
		
		if(word.equals(reverse())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public String reverse(){
		
		String rev = "";
		
		for(int i = word.length() -1; i >= 0; i--){
			
			rev += word.charAt(i);
		}		
		return rev;
	}
	
	public String countEachLetter(){
		
		String string = new String("");
		String copy = new String(this.word);
		
		for(int i = 0; i < word.length(); i++){
			
			if(Character.isLetter(copy.charAt(i))){
				if(copy.charAt(i) != '*'){										
					
					string += copy.charAt(i) + " appears " + countLetter(copy.charAt(i)) + " time(s)\n";
					
					if(countLetter(copy.charAt(i)) > 1){					
						copy = copy.replace(copy.charAt(i), '*');
					}				
				}
			}
		}
		return string;		
	}
	
	public int countLetter(char c){
		
		int n = 0;
		
		for(int i = 0; i < word.length(); i++){
			
			if(word.charAt(i) == c){
				n++;
			}
		}
		return n;
	}		
	
	public MyString copyTo(){
		
		MyString copy = new MyString(this.word);
		
		return copy;
	}
			
	public String toString(){
		
		return word;		
	}
	
}
