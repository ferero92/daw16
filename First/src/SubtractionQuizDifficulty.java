import javax.swing.JOptionPane;
public class SubtractionQuizDifficulty {

	public static void main(String[] args) {
		int question = Integer.parseInt(JOptionPane.showInputDialog(null, "Welcome to Subtraction Quiz" +
							"\n" + "Please select the number of questions", "Subtraction Quiz",
							JOptionPane.INFORMATION_MESSAGE));		
		int correct = 0;
		int limit = 0;
		int increment = 0;		
		String difficulty = "";
		
		do {
			difficulty = JOptionPane.showInputDialog(null, "Please select a difficulty:" + "\n" +
							"(easy, medium or hard", "Subtraction Quiz", JOptionPane.INFORMATION_MESSAGE);
			switch(difficulty){
				case "easy":limit = 9;//Lo multiplicamos por ese número para que nos dé un rango entre 1 y 9
							increment = 1;
					break;
				case "medium":limit = 90;
							  increment = 10;
					break;
				case "hard":limit = 900;
							increment = 100;
					break;
					default:JOptionPane.showMessageDialog(null, "Please select a correct value.",
							"Subtraction Quiz", JOptionPane.WARNING_MESSAGE);
							difficulty = "";
			}
			for(int i = 0; i < question; i++){
				int number1 = (int) (Math.random() * limit + increment);
				int number2 = (int) (Math.random() * limit + increment);
				if (number1 < number2){
					int aux = number1;
					number1 = number2;
					number2 = aux; 
				}
				int answer = Integer.parseInt(JOptionPane.showInputDialog(null,
						"What is " + number1 + " - " + number2 + "?", "Subtraction Quiz",
						JOptionPane.INFORMATION_MESSAGE));
				if (answer == number1 - number2){
					correct++;
				}
			}
			
		}while(difficulty == "");		
		
		JOptionPane.showMessageDialog(null, "Congratulations! You have got " + correct + " hits and " +
			(question - correct) + " failures.", "Subtraction Quiz Loop", JOptionPane.INFORMATION_MESSAGE);
	}
}