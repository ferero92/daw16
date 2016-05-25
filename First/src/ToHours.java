import java.util.Scanner;/*This program tell us how many hours and minutes 
are a quantity of seconds*/
//Es el primer paso siempre, importar las librerias que usaremos
public class ToHours {

	public static void main(String[] args) {
		//Le indicamos al programa que introduciremos la cifra con el teclado
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the seconds: "); /*Es importante indicar mediante un
		mensaje qué debemos hacer*/
		
		int seconds = input.nextInt(); /*Declaramos los segundos y de dónde debe sacarlos el
		programa*/
		
		int hours = seconds/3600; //Incluimos una constante y declaramos otra variable
		
		int minutes = (seconds%3600)/60;
		
		System.out.println(seconds + " seconds are: " + hours + " hours and " + minutes + " minutes");
		
		input.close();

	}

}
