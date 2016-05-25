import javax.swing.JOptionPane;
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() * 10);
		
		int number2 = (int) (Math.random() * 10);
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
				"What is " + number1 + " + " + number2 + "?", "Addition Quiz", 
				JOptionPane.INFORMATION_MESSAGE));
		
		while(number1 + number2 != answer){
			answer = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Wrong answer. Please try again." +	"What is " + number1 +
					" + " + number2 + "?", "Addition Quiz",
					JOptionPane.INFORMATION_MESSAGE));
		}
		
		JOptionPane.showMessageDialog(null, "Your anwer is correct. Good job!",
				"Addtion Quiz", JOptionPane.INFORMATION_MESSAGE);
	}
}