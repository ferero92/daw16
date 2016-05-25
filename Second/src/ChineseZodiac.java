import javax.swing.JOptionPane; //This program tells us our chinese zodiac
public class ChineseZodiac {

	public static void main(String[] args) {
		
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year of your birth:",
				"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE));
		
		switch (year % 12){
		
			case 0: JOptionPane.showMessageDialog(null, "Your chinese zodiac is monkey",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 1: JOptionPane.showMessageDialog(null, "Your chinese zodiac is rooster",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 2: JOptionPane.showMessageDialog(null, "Your chinese zodiac is dog",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 3: JOptionPane.showMessageDialog(null, "Your chinese zodiac is pig",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 4: JOptionPane.showMessageDialog(null, "Your chinese zodiac is rat",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 5: JOptionPane.showMessageDialog(null, "Your chinese zodiac is ox",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 6: JOptionPane.showMessageDialog(null, "Your chinese zodiac is tiger",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 7: JOptionPane.showMessageDialog(null, "Your chinese zodiac is rabbit",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 8: JOptionPane.showMessageDialog(null, "Your chinese zodiac is dragon",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 9: JOptionPane.showMessageDialog(null, "Your chinese zodiac is snake",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 10: JOptionPane.showMessageDialog(null, "Your chinese zodiac is horse",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
				break;		
			case 11: JOptionPane.showMessageDialog(null, "Your chinese zodiac is sheep",
					"Chinese Zodiac", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}