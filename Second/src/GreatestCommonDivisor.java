import javax.swing.JOptionPane;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a two digit number:",
							"Greatest Common Divisor", JOptionPane.QUESTION_MESSAGE));
		int number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a two digit number:",
							"Greatest Common Divisor", JOptionPane.QUESTION_MESSAGE));	
		int divisor = (number1 < number2)?number1:number2;
			
		while(number1 % divisor != 0 || number2 % divisor != 0){
			divisor--;			
		}
		
		JOptionPane.showMessageDialog(null, "The greatest common divisor of " + number1 + " and " +
				number2 + " is: " + divisor, "Greatest Common Divisor", JOptionPane.INFORMATION_MESSAGE);
	}
}