package tools;

public class MyMath {

	public static int greatestCommonDivisor(int number1, int number2){

		number1 = Math.abs(number1);
		number2 = Math.abs(number2);

		for(int divisor = (number1 < number2)?number1:number2; divisor > 1; divisor--){

			if(number1 % divisor == 0 && number2 % divisor == 0){
				return divisor;
			}
		}
		return 1;
	}

	public static int leastCommonMultiple(int number1, int number2){

		for(int multiple = (number1 > number2)?number1:number2; multiple < (number1 * number2); multiple++){

			if(multiple / number1 == 0 && multiple / number2 == 0){
				return multiple;
			}
		}
		return number1 * number2;
	}

}
