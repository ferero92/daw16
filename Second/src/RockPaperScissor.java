import javax.swing.JOptionPane;
public class RockPaperScissor {

	public static void main(String[] args) {	
		int count = 0;
		int correct = 0;
		int wrong = 0;
		int draw = 0;
		
		while(count < 10){
			int user = 3;
			int computer = (int) (Math.random() * 3);
		
			while(user == 3){
				String userString = JOptionPane.showInputDialog(null,
						"Choose an option! Rock, Paper or Scissors",
						"Rock, Paper and Scissors game", JOptionPane.QUESTION_MESSAGE);			
				
				switch(userString){
					case "Rock":user = 0;
						break;
					case "Paper":user = 1;
						break;
					case "Scissors":user = 2;
						break;
					default: JOptionPane.showMessageDialog(null,
							"You have to type a correct option. Please try again.",
							"Rock, Paper and Scissros game", JOptionPane.WARNING_MESSAGE); user = 3;											
				}
			}
			switch(computer){
				case 0: JOptionPane.showMessageDialog(null,	"Rock!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE);
					break;
				case 1: JOptionPane.showMessageDialog(null,	"Paper!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2: JOptionPane.showMessageDialog(null,	"Scissors!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE);
			}
					
			if(user == 0 && computer == 0){
				JOptionPane.showMessageDialog(null, "We draw!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE); draw++;
			}
			else{
				if(user == 0 && computer == 1){
					JOptionPane.showMessageDialog(null, "You lose!", "Rock, Paper and Scissors game",
							JOptionPane.INFORMATION_MESSAGE); wrong++;
				}
				else{
					if(user == 0 && computer == 2){
						JOptionPane.showMessageDialog(null, "You win!", "Rock, Paper and Scissors game",
								JOptionPane.INFORMATION_MESSAGE); correct++;
					}
				}
			}
			
			if(user == 1 && computer == 0){
				JOptionPane.showMessageDialog(null, "You win!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE); correct++;
			}
			else{
				if(user == 1 && computer == 1){
					JOptionPane.showMessageDialog(null, "We draw!", "Rock, Paper and Scissors game",
							JOptionPane.INFORMATION_MESSAGE); draw++;
				}
				else{
					if(user == 1 && computer == 2){
						JOptionPane.showMessageDialog(null, "You lose!", "Rock, Paper and Scissors game",
								JOptionPane.INFORMATION_MESSAGE); wrong++;
					}
				}
			}
			
			if(user == 2 &&  computer == 0){
				JOptionPane.showMessageDialog(null, "You lose!", "Rock, Paper and Scissors game",
						JOptionPane.INFORMATION_MESSAGE); wrong++;
			}
			else{
				if(user == 2 && computer == 1){
					JOptionPane.showMessageDialog(null, "You win!", "Rock, Paper and Scissors game",
							JOptionPane.INFORMATION_MESSAGE); correct++;
				}
				else{
					if(user == 2 && computer == 2){
						JOptionPane.showMessageDialog(null, "We draw!", "Rock, Paper and Scissors game",
								JOptionPane.INFORMATION_MESSAGE); draw++;
					}
				}
			}
			
			count++;		
		}
		String output = "Results: You win " + correct + " times, you lose " + wrong + " times and we draw " +
		draw + " times.";
		
		JOptionPane.showMessageDialog(null, output, "Rock, Paper and Scissors game", JOptionPane.INFORMATION_MESSAGE);
	}
}