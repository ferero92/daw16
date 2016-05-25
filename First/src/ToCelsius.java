import java.util.Scanner;//This program converns from Fahrenheit to Celsius 
public class ToCelsius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a degree in Fahrenheit: ");
		
		double fahrenheit = input.nextDouble();
		
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius.");
		
		input.close();

	}

}
