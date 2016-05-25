import javax.swing.JOptionPane; //This program shows a message if you enter a specific number
public class IfDemo {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog
				(null, "Enter an integer:", "If Demo",
				JOptionPane.INFORMATION_MESSAGE));
		
		boolean neither = false;
		
		if (number % 5 == 0) {
			JOptionPane.showMessageDialog(null, "Hi Five", "If Demo",
					JOptionPane.INFORMATION_MESSAGE);
			
			neither = true;
		}
		
		if (number % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Hi Even", "If Demo",
					JOptionPane.INFORMATION_MESSAGE);
			
			neither = true;
		}
		
		if (neither != true) {
			JOptionPane.showMessageDialog(null, "That number sucks, try again", "If Demo",
					JOptionPane.WARNING_MESSAGE);
		}
	
	}

}
