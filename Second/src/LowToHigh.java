import javax.swing.JOptionPane;//This program classifies three numbers low to high
public class LowToHigh {
	public static void main(String[] args) {
		int number1 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter an integer", "Low to High", 
				JOptionPane.INFORMATION_MESSAGE));
		
		int number2 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter an another integer", "Low to High", 
				JOptionPane.INFORMATION_MESSAGE));
		
		int number3 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter an integer again", "Low to High", 
				JOptionPane.INFORMATION_MESSAGE));
		
		if (number1 < number2){
			if (number2 < number3){
				JOptionPane.showMessageDialog(null, number1 + " < " + number2 +
						" < " + number3, "Low to High",
						JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				if (number1 < number3){
					JOptionPane.showMessageDialog(null, number1 + " < " +
							number3 + " < " + number2, "Low to High",
							JOptionPane.INFORMATION_MESSAGE);
				}
			
				else {
					JOptionPane.showMessageDialog(null, number3 + " < " +
							number1 + " < " + number2, "Low to High",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		else {
			if (number2 < number3){
				if (number1 < number3){
					JOptionPane.showMessageDialog(null, number2 + " < " +
							number1 + " < " + number3, "Low to High",
							JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, number2 + " < " +
							number3 + " < " + number1, "Low to High",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, number3 + " < " +
						number2 + " < " + number1, "Low to High",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}