import java.util.Scanner; //This program calculates the amount of taxes
public class SalesTax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Enter purchase amount: ");
		
		double prize = input.nextDouble();
		
		double tax = prize * 0.21;
		
		System.out.println("Sales tax is " + (int) (tax * 100) / 100.0);
		
		input.close();

	}

}
