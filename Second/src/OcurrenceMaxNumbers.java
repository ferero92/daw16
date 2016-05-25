import javax.swing.JOptionPane;
public class OcurrenceMaxNumbers {
	
	public static void main(String[] args) {		
		int number;
		int max = 0;
		int count = 0;		
		do{		
			number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter an integer:",
					"Ocurrence Max Numbers", JOptionPane.QUESTION_MESSAGE));
					
			if(number > max){
				max = number;
				count = 0;
			}
			
			if(number == max){
				count++;
			}
		
		}while(number != 0);
		
		JOptionPane.showMessageDialog(null,
				"The max number is " + max + ", it is repeat " + count + " times.",
				"Ocurrence Max Numbers", JOptionPane.INFORMATION_MESSAGE);
	}
}