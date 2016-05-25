import javax.swing.JOptionPane;
public class DecimalToBinary {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a decimal number:",
				"Decimal to Binary", JOptionPane.QUESTION_MESSAGE));
		int aux = number;
		int binary = 0;
		int count = 1;
		
		while(aux != 0){						
			binary += (aux % 2) * count;
			aux /= 2;		
			count *= 10;			
		}
		
		JOptionPane.showMessageDialog(null, "The decimal number " + number + " is " +
				binary + " in binary.", "Decimal to Binary", JOptionPane.INFORMATION_MESSAGE);
	}
}
