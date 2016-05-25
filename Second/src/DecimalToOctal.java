import javax.swing.JOptionPane;
public class DecimalToOctal {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a decimal number:",
				"Decimal to Octal", JOptionPane.QUESTION_MESSAGE));
		int aux = number;
		int octal = 0;
		int count = 1;
		
		while(aux != 0){						
			octal += (aux % 8) * count;
			aux /= 8;		
			count *= 10;			
		}
		
		JOptionPane.showMessageDialog(null, "The decimal number " + number + " is " +
				octal + " in octal.", "Decimal to Octal", JOptionPane.INFORMATION_MESSAGE);
	}
}