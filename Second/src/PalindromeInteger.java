import javax.swing.JOptionPane;
public class PalindromeInteger {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number:", "Palindrome", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "The reverse of " + number + " is " + revInteger(number) + palindString(number, revInteger(number)), "Palindrome", JOptionPane.INFORMATION_MESSAGE);
		
	}		
	
	public static int revInteger(int number){
		
		int reverse = 0;
				
		for(int i = numberDigits(number); number != 0; i--){
			reverse += (number % 10 * Math.pow(10, i - 1));
			number /= 10;
		}		
		return reverse;
	}
	
	public static int numberDigits(int number){
		
		int digits = 0;
		
		do{
			number /= 10;
			digits++;
			
		}while(number != 0);
		
		return digits;
		
	}
	
	public static boolean isPalind(int number, int reverse){
				
		if(number == reverse){
			return true;
		}
		else {
			return false;		
		}
	
	}
	
	public static String palindString(int number, int reverse){
		
		if(isPalind(number, reverse)){
			return ", is a palind.";
		}
		else{
			return ", is not a palind.";
		}
		
	}
	
}