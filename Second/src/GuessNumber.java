import javax.swing.JOptionPane;
public class GuessNumber {

	public static void main(String[] args) {
		int guess = (int) (Math.random() * 101);		
		int count = 1;
		int number = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Please enter a number:", "Guess Number", 
				JOptionPane.INFORMATION_MESSAGE));
		while(guess != number){
			if(guess < number){
				number = Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Too high! Please try again:", "Guess Number", 
						JOptionPane.INFORMATION_MESSAGE));
			}
			else{
				number = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Too low! Please try again:", "Guess Number",
						JOptionPane.INFORMATION_MESSAGE));
			}
			count++;
		}
		JOptionPane.showMessageDialog(null,
				"Congratulations! You have found the guess number and only took you " +
		count + " tries.", "Guess Number", JOptionPane.INFORMATION_MESSAGE);
	}
}