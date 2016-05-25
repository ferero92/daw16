import javax.swing.JOptionPane;//This program tells you what is your note at the Spanish System
public class Notes {

	public static void main(String[] args) {
		
		double note = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your note",
				"Notes", JOptionPane.INFORMATION_MESSAGE));
		
		if (note < 5) {
			
			JOptionPane.showMessageDialog(null, "Suspenso", "Notes",
				JOptionPane.WARNING_MESSAGE);
		}
		
		else {
			
			if (note < 6) {
				
					JOptionPane.showMessageDialog(null, "Aprobado", "Notes",
						JOptionPane.INFORMATION_MESSAGE);
				}
					
			else {
						
				if (note < 7) {
							
						JOptionPane.showMessageDialog(null, "Bien", "Notes",
							JOptionPane.INFORMATION_MESSAGE);
						}
							
				else {
								
						if (note < 9) {
									
							JOptionPane.showMessageDialog(null, "Notable", "Notes",
								JOptionPane.INFORMATION_MESSAGE);
								}
						else {
							
							if (note < 10) {
								
								JOptionPane.showMessageDialog(null, "Sobresaliente", "Notes",
									JOptionPane.INFORMATION_MESSAGE);
							}
							
							else {
								
								if (note == 10) {
									
									JOptionPane.showMessageDialog(null, "Matrícula de honor",
										"Notes", JOptionPane.INFORMATION_MESSAGE);
								}
							}
						}
							}
						}
			
		}

	}
	
}
