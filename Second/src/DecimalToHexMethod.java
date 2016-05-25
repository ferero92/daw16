import javax.swing.JOptionPane;
public class DecimalToHexMethod {

	public static void main(String[] args) {
		
		int number = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a decimal number:", "Decimal to", JOptionPane.QUESTION_MESSAGE));				
		
		JOptionPane.showMessageDialog(null, number + " in decimal is: " + "\n" + toHex(number) + " in hex, " + "\n" + toOctal(number) + " in octal and " + "\n" + toBinary(number) + " in binary.", "Decimal to", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static String toHex(int decimal){
		
		String hex = "";		
		
		do{			
			switch(decimal % 16){
				case 0:hex = "0" + hex;
					break;
				case 1:hex = "1" + hex;
					break;
				case 2:hex = "2" + hex;
					break;
				case 3:hex = "3" + hex;
					break;
				case 4:hex = "4" + hex;
					break;
				case 5:hex = "5" + hex;
					break;
				case 6:hex = "6" + hex;
					break;
				case 7:hex = "7" + hex;
					break;
				case 8:hex = "8" + hex;
					break;
				case 9:hex = "9" + hex;
					break;
				case 10:hex = "A" + hex;
					break;
				case 11:hex = "B" + hex;
					break;
				case 12:hex = "C" + hex;
					break;
				case 13:hex = "D" + hex;
					break;
				case 14:hex = "E" + hex;
					break;
				case 15:hex = "F" + hex;
			}			
			decimal /= 16;					
			
		}while(decimal != 0);
		
		return hex;	
	}

	public static int toOctal(int decimal){
		
		int octal = 0;
		int count = 1;
		
		do{
			octal += (decimal % 8 * count);
			count *= 10;
			decimal /= 8;
			
		}while(decimal != 0);
		
		return octal;
	}

	public static int toBinary(int decimal){
		
		int binary = 0;
		int count = 1;
		
		do{
			
			binary += (decimal % 2 * count);
			count *= 10;
			decimal /= 2;
			
		}while(decimal != 0);
		
		return binary;
	}
}