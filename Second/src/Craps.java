import javax.swing.JOptionPane;
public class Craps {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to craps! A funny game", "Craps", JOptionPane.INFORMATION_MESSAGE);
		
		int result = rollIt();		
		
		if(!(firstRoll(result))){
			JOptionPane.showMessageDialog(null, "Point established" + " (" + result + ")", "Scraps", JOptionPane.INFORMATION_MESSAGE);
			
			rollAgain(result);
		}
							
	}
	
	public static int diceRoll(){
		
		int dice = (int)(Math.random() * 6 + 1);
		
		return dice;		
	}

	public static int rollIt(){
		
		int dice1 = diceRoll();
		int dice2 = diceRoll();	
		int sum = dice1 + dice2;
												
		JOptionPane.showMessageDialog(null, dice1 + " + " + dice2 + " = " + sum);									
			
		return sum;		
	}

	public static boolean firstRoll(int result){			
		
		if(result == 2 || result == 3 || result == 12){
			JOptionPane.showMessageDialog(null, "You lose", "Scraps", JOptionPane.INFORMATION_MESSAGE);
			return true;
		}
		else{
			if(result == 7 || result == 11){
				JOptionPane.showMessageDialog(null, "You win", "Scraps", JOptionPane.INFORMATION_MESSAGE);
				return true;
			}
			else{				
				return false;				
			}
		}
	}

	public static void rollAgain(int point){
		int result = 0;
		
		do{			
			result = rollIt();
			
		}while(result != point && result != 7);
		
		if(result == 7){
			JOptionPane.showMessageDialog(null, "You lose", "Scraps", JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, "You win", "Scraps", JOptionPane.INFORMATION_MESSAGE);
		}										
	}
		
}