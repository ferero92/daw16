import javax.swing.JOptionPane;
public class AdditionQuiz {

	public static void main(String[] args) {
		
		int number1 = (int) (Math.random() * 10);
		
		int number2 = (int) (Math.random() * 10);
		
		int question =  Integer.parseInt (JOptionPane.showInputDialog(null, "How much is " + number1 + " + " + number2 + "?",
				"Addition Quiz", JOptionPane.QUESTION_MESSAGE));
		
		int answer = number1 + number2;
		
		String output = number1 + " + " + number2 + " = " + question + " is " + (question
				== answer);
		
		JOptionPane.showMessageDialog(null, output, "Addition Quiz", JOptionPane.INFORMATION_MESSAGE);
	}
}