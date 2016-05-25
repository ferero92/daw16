import javax.swing.JOptionPane;
public class Multiplication {

	public static void main(String[] args) {
		
		String output="";
		
		for(int number = 0; number <= 10; number++){
			
			output = "La tabla de multiplicar del " + number + ":" + "\n";
			
			for(int i = 0; i <= 10; i++){
				
				output += number + " x " + i +" = " + (number*i)+"\n";		
			}
			
			JOptionPane.showMessageDialog(null, output, "Multiplication", JOptionPane.INFORMATION_MESSAGE);
			
		}		
	}
}