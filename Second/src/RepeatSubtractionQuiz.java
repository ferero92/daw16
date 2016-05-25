import javax.swing.JOptionPane;
public class RepeatSubtractionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random() *10);
		int number2 = (int) (Math.random() *10) + number1;
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
				"What is " + number2 + " - " + number1 + "?", "Subtraction Quiz",
				JOptionPane.QUESTION_MESSAGE));
		
		int count = 0;
		int correct = 0;
		int wrong = 0;
		
		while(count < 1){
			count++;			
			if(number2 - number1 == answer){
				correct++;
			}
			else{
				wrong++;
			}			
			number1 = (int) (Math.random() *10);
			number2 = (int) (Math.random() *10) + number1;
			answer = Integer.parseInt(JOptionPane.showInputDialog(null,
					"What is " + number2 + " - " + number1 + "?", "Subtraction Quiz",
					JOptionPane.QUESTION_MESSAGE));
		}
		
		JOptionPane.showMessageDialog(null, "Congratulations. You got " +
		correct + " hits and " + wrong + " failures", "Subtraction Quiz",
		JOptionPane.INFORMATION_MESSAGE);
	}
}