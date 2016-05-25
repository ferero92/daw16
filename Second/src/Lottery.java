import javax.swing.JOptionPane;//This program plays a lottery game. Enjoy it
public class Lottery {

	public static void main(String[] args) {										
		
		int lottery = (int) (Math.random() * 100);
		
		int answer = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a two-digit number: ",
				"Lottery", JOptionPane.INFORMATION_MESSAGE));
		
		int lotteryDigit1 = lottery / 10;
		
		int lotteryDigit2 = lottery % 10;
		
		int answerDigit1 = answer / 10;
		
		int answerDigit2 = answer % 10;
		
		if(lottery == answer){
			JOptionPane.showMessageDialog(null, "Congratulation! You win $10.000",
					"Lottery", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else{
			if(lotteryDigit1 == answerDigit2 && lotteryDigit2 == answerDigit1){
				JOptionPane.showMessageDialog(null, "Congratulation! You win $3.000",
						"Lottery", JOptionPane.INFORMATION_MESSAGE);
			}
			else{
				if(lotteryDigit1 == answerDigit1 || lotteryDigit1 == answerDigit2 ||
						lotteryDigit2 == answerDigit1 || lotteryDigit2 == answerDigit2){
					JOptionPane.showMessageDialog(null, "Congratulation! You win $1.000",
							"Lottery", JOptionPane.INFORMATION_MESSAGE);
			}
				else{
					JOptionPane.showMessageDialog(null, "Sorry, you don't win anything. " +
							"Please, try again.", "Lottery", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}		
	}
}