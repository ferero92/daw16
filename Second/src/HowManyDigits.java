import javax.swing.JOptionPane;
public class HowManyDigits {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Please enter a integer number", "How Many Digits",
				JOptionPane.QUESTION_MESSAGE));
		int count = 0;
		int aux = number;
				
		while(aux != 0){
			count++;
			aux /= 10;
		}
				
		JOptionPane.showMessageDialog(null, "The number " + number + " has " + count + " digits.",
				"How Many Digits", JOptionPane.INFORMATION_MESSAGE);
	}
}