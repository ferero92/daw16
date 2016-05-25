import javax.swing.JOptionPane;
public class DigitsInAnInteger {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number:", "Digits in an integer", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, "The sum of digits in " + number + " is " + sumDigits(number), "Digits in an integer", JOptionPane.INFORMATION_MESSAGE);		
	}
	
	public static int sumDigits(int n){
		
		int sum = 0;
		do{
			sum += n % 10;
			n /= 10;
			
		}while(n != 0);
		return sum;
	}

}
