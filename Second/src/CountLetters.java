
public class CountLetters {

	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 100;
		
		char[] letters = randomArrayChar(ARRAY_LENGTH);		
		
		int[] countChar = countChar(letters);
		
		System.out.println(printABC(countChar));
				
		System.out.println(printArray(countChar));	
						
	}
	
	public static char[] randomArrayChar(final int ARRAY_LENGTH){
		
		char[] letters = new char[ARRAY_LENGTH];
		
		for(int i = 0; i < letters.length; i++){
			
			letters[i] = randomChar();
		}
		
		return letters;
	}
	
	public static char randomChar(){
		
		char character = (char)(int)('a' + Math.random() * ('z' - 'a' + 1));		
		
		return character;
	}

	public static int[] countChar(char[] letters){
		
		int length = (int)'z' - (int)'a' + 1;
		int[] howManyChar = new int[length];
		
		for(int i = 0; i < letters.length; i++){
			
			howManyChar[(letters[i] - 'a')]++;									
		}		
		return howManyChar;
	}
	
	public static String printArray(int[] array){
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "   ";
		}
		
		return String;
	}
	
	public static String printABC(int[] array){
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += (char)(i + 'a') + "   ";
		}
		
		return String;
	}
						
}