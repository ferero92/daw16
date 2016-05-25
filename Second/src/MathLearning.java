import javax.swing.*;
public class MathLearning {

	public static void main(String[] args) {
		
       final int NUMBER_OF_DIGITS = 2;
       int right = 0;
       
       JOptionPane.showMessageDialog(null, "Math Learning: Subtraction");
       long time = System.currentTimeMillis(); 
       
       do{
    	   int number1 = generateOperand(NUMBER_OF_DIGITS);
           int number2 = generateOperand(NUMBER_OF_DIGITS);
           
           if(number1 < number2){
        	   int aux=number1;
        	   number1=number2;
        	   number2=aux;
           }
           
           int answer = Integer.parseInt(JOptionPane.showInputDialog(null,"How much is "+ number1 + " minus "+ number2 +"?"));
           
           if (answer == number1 - number2){
        	   ++right;
        	   JOptionPane.showMessageDialog(null, "Good job: " + right + " right answers");
    	   
          }
           else
        	   JOptionPane.showMessageDialog(null, "Wrong position: " + findMistakenPosition(number1, number2, answer));
       }while (right < 5);
       
       time = (System.currentTimeMillis() - time) / 1000;
       
       JOptionPane.showMessageDialog(null, "You have 5 correct answer and only took you " + time + " seconds. Great!");
       
	}

	public static int findMistakenPosition(int n1, int n2, int a){
		
		int position = 0;
		
		int[] answer = getArray(a);
		int[] correct = getArray((n1 - n2));
		
		for(int i = 0; i < answer.length; i++){
			
			if(answer[i] != correct[i]){
				position = i;
				break;
			}			
		}										
		return position;
	}
	
	public static int[] getArray(int n){				
		
		int[] array = new int[numberDigits(n)];
		
		for(int i = (array.length - 1); i >= 0; i--){
									
			array[i] = n / (int) (Math.pow(10, i));
		
			n %= (int) (Math.pow(10, i));						
		}		
		return array;
	}
	
	public static int generateOperand(int n){
		
		int number = (int)(Math.random() * (Math.pow(10, n) - Math.pow(10, n - 1)) + Math.pow(10, n - 1));
		
		return number;
	}	
	
	public static int numberDigits(int number){//********************count the number of digits in an integer
		
		int digits = 0;
		
		do{
			number /= 10;
			digits++;
			
		}while(number != 0);
		
		return digits;		
	}	
		
}
