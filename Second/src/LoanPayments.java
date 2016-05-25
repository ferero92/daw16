import javax.swing.JOptionPane; /*This program calculates the monthly payment for a loan
								and shows it in a message dialog*/
public class LoanPayments {

	public static void main(String[] args) {
				
		double loanAmount = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Enter the loan amount:", "Loan Payments", JOptionPane.QUESTION_MESSAGE));
		
		double interestRate = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Enter the monthly interest rate:", "Loan Payments", JOptionPane.QUESTION_MESSAGE));
		
		double numberOfYears = Double.parseDouble(JOptionPane.showInputDialog(null, 
				"Enter the number of years:", "Loan Payments", JOptionPane.QUESTION_MESSAGE));;
		
		JOptionPane.showMessageDialog(null, "The monthly payment is " + (int)(loanAmount * interestRate 
				/ (1-(1/ ( Math.pow((1+interestRate), (numberOfYears * 12))))) * 100) / 100.0 + "€.",
				"Loan Payments", JOptionPane.INFORMATION_MESSAGE);		
				
	}

}
