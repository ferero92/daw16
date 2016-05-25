import java.util.Scanner; //This program tells us how many coins you need to pay
public class MonetaryUnits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an amount: ");
		
		double amount = input.nextDouble();
		
		int cents = (int) (amount * 100);
		
		int twoEuros = cents / 200;
		
		int euros = (cents % 200) / 100;
		
		int fiftyCents = ((cents % 200) % 100) / 50;
		
		int twentyCents = (((cents % 200) % 100) % 50) / 20;
		
		int tenCents = ((((cents % 200) % 100) % 50) % 20) / 10;
		
		int fiveCents = (((((cents % 200) % 100) % 50) % 20) % 10) / 5;
		
		int twoCents = ((((((cents % 200) % 100) % 50) % 20) % 10) % 5) / 2;
		
		int oneCent = (((((((cents % 200) % 100) % 50) % 20) % 10) % 5) % 2);
		
		System.out.println(amount + "€ are:\n" + 
				"\t" + twoEuros + " coins of two euros,\n" +
				"\t" + euros + " coins of one euro,\n" +
				"\t" + fiftyCents + " coins of fifty cents,\n" +
				"\t" + twentyCents + " coins of twenty cents,\n" +
				"\t" + tenCents	+ " coins of ten cents,\n" +
				"\t" + fiveCents + " coins of five cents,\n" +
				"\t" + twoCents	+ " coins of two cents\n" +
				"\t" + oneCent + " and coins of one cent.");
		
		input.close();
		
	}

}
