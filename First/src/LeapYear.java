import javax.swing.JOptionPane;//This program tells us if a year is leap or not
public class LeapYear {

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a year",
				"Leap Year", JOptionPane.INFORMATION_MESSAGE));
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			JOptionPane.showMessageDialog(null, "The year " + year + " is a leap year",
					"Leap Year", JOptionPane.INFORMATION_MESSAGE);	
		}
		
		else {
			JOptionPane.showMessageDialog(null, "The year " + year + " is not a leap year",
					"Leap Year", JOptionPane.INFORMATION_MESSAGE);	
		}

	}

}
