import javax.swing.JOptionPane;
public class BMI {

	public static void main(String[] args) {
		
		double weight = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter your weight (in kilograms)", "BMI", JOptionPane.QUESTION_MESSAGE));
		
		double height = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter your height (in meters)", "BMI", JOptionPane.QUESTION_MESSAGE));
		
		double BMI = (int) (weight / (Math.pow(height, 2)) *10) / 10;
		
		if (BMI < 18.5) {
			JOptionPane.showMessageDialog(null, "Your BMI are " + BMI + ", you are underweight",
					"BMI", JOptionPane.WARNING_MESSAGE);
		}
		else {
			if (BMI < 25.0){
				JOptionPane.showMessageDialog(null, "Your BMI are " + BMI + ", you are normal",
						"BMI", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				if (BMI < 30.0){
					JOptionPane.showMessageDialog(null, "Your BMI are " + BMI +
							", you are overweight",	"BMI", JOptionPane.WARNING_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null, "Your BMI are " + BMI +
							", you are obese", "BMI", JOptionPane.WARNING_MESSAGE);
				}
			}
		}
	}
}