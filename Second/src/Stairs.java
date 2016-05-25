import javax.swing.JOptionPane;
public class Stairs {

	public static void main(String[] args) {
		
		final int NUMBER_OF_DICES = 6;
		int[] dices = firstRoll(NUMBER_OF_DICES);
		
		JOptionPane.showMessageDialog(null, "Welcome to stairs. Roll the dices?");
		
		if(!(stairs(dices))){
			JOptionPane.showMessageDialog(null, "You don't have stairs. Try again");
			
			int count = 0;
			
			do{
				int position = Integer.parseInt(JOptionPane.showInputDialog(null, "Which dice do you want to roll? (Wich position)" + "\n" + printArray(dices)));
				dices[position] = diceRoll();
				count++;
			}while(!(stairs(dices)));
			
			JOptionPane.showMessageDialog(null, "You have stairs in only " + count + " tries. So lucky.");
		}
		else{
			JOptionPane.showMessageDialog(null, "You have stairs in your first roll. So lucky.");
		}
		
	}
	
	public static int diceRoll(){//****a dice roll
		
		int dice = (int)(Math.random() * 6 + 1);
		
		return dice;		
	}
	
	public static int[] firstRoll(int length){//****first roll of the program
		
		int[] dices = new int[length];
		
		for(int i = 0; i < dices.length; i++){
			
			dices[i] =  diceRoll();
		}
		return dices;		
	}
	
	public static boolean stairs(int[] dices){//***********do you have stairs?
		
		for(int i = 0; i < dices.length; i++){
			for(int j = 0; j < dices.length; j++){												
				if(dices[i] == dices[j] && i != j){
					return false;					
				}
			}			
		}
		return true;
	}
	
	public static String printArray(int[] array){//********************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "  ";
		}
		return String;
	}	

}
