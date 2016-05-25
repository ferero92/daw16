package objects;

public class Loan {

	private double amount;
	
	private double interest;
	
	private int years;
	
	public Loan() {
		
		amount = 1000;
		interest = 10;
		years = 1;
	}
	
	public Loan(double newAmount, double newInterest, int newYears) {
		
		amount = newAmount;
		interest = newInterest;
		years = newYears;
	}
	
	public double getAmount() {
		
		return amount;		
	}
	
	public double getInterest() {
		
		return interest;
	}
	
	public int getYears() {
		
		return years;
	}
	
	public void setAmount(double amount){
		
		this.amount = amount;
	}
	
	public void setInterest(double interest){
		
		this.interest = interest;
	}
	
	public void setYears(int years){
		
		this.years = years;
	}
	
	public double calculateLoan() {
		
		return amount * (interest / 100) / (1 - (1 / (Math.pow(1 + (interest / 100), years * 12))));
	}
	
	public String toString() {
		
		return "Mothly payment for the loan = " + calculateLoan();
	}
	
}
