import javax.swing.JOptionPane;
public class SubtractionQuizLoop {

	public static void main(String[] args) {
		int questions = 5;		
		int count = 0;
		int correct = 0;
		
		while(count < questions){
			int number1 = (int) (Math.random() * 10);
			int number2 = (int) (Math.random() * 10);
			if (number1 < number2){
				int aux = number1;
				number1 = number2;
				number2 = aux; 
			}
			int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
						"What is " + number1 + " - " + number2 + "?", "Subtraction Quiz Loop",
						JOptionPane.INFORMATION_MESSAGE));
			if (answer == number1 - number2){
				correct++;
			}
			count++;
		}
		JOptionPane.showMessageDialog(null, "Congratulations! You have got " + correct + " hits and " +
			(questions - correct) + " failures.", "Subtraction Quiz Loop", JOptionPane.INFORMATION_MESSAGE);
	}
}
