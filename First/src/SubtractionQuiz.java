import javax.swing.JOptionPane;
public class SubtractionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random()*10 + 1);
		
		int number2 = (int) (Math.random()*10 + 1);
		
		if (number1 > number2){
			int question1 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"How much is " + number1 + " - " +	number2 + "?",
					"Subtraction Quiz", JOptionPane.QUESTION_MESSAGE));
			
			int answer1 = number1 - number2;
			
			JOptionPane.showMessageDialog(null, number1 + " - " + number2 + " = " +
			question1 + " is " + (question1 == answer1), "Subtraction Quiz",
			JOptionPane.QUESTION_MESSAGE);
			
		}
		else {
			int question2 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"What is " + number2 + " - " +	number1 + "?",
					"Subtraction Quiz", JOptionPane.QUESTION_MESSAGE));
			
			int answer2 = number2 - number1;
			
			JOptionPane.showMessageDialog(null, number2 + " - " + number1 + " = " +
					question2 + " is " + (question2 == answer2), "Subtraction Quiz",
					JOptionPane.QUESTION_MESSAGE);
		}
	}
}