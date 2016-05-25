import javax.swing.JOptionPane;
public class WorkingWithArrays {

	public static void main(String[] args) {
		
		final int length = 6;
		int[] array = randomValues(length);
		int menu = 0;
		
		do{
			menu = menuSelect();
			switch(menu){
				case 1: inputValues(array);
					break;
				case 2: printArray(array);
					break;
				case 3: sumArray(array);
					break;
				case 4: largestValue(array);
					break;
				case 5: indexLargest(array);
					break;
				case 6: randomShufling(array);
					break;
				case 7: shiftingValues(array);
					break;
				case 8:JOptionPane.showMessageDialog(null, "Exit", "Working with Arrays", JOptionPane.INFORMATION_MESSAGE); 
					break;
					default:JOptionPane.showMessageDialog(null, "Incorrect option. Try again", "Working with Arrays", JOptionPane.WARNING_MESSAGE);
			}			
		}while(menu != 8);

	}
	
	public static int[] randomValues(int lenght){//**************************initializing with random values
		
		int[] array = new int[lenght];
		
		for(int i = 0; i < lenght; i++){
			
			array[i] = (int)(Math.random() * 9 + 1);			
		}		
		return array;
	}
	
	public static int menuSelect(){//****************************************************menu of the program
		
		String String = "Welcome to Working with Arrays, please select an option:" + "\n"
							+ "\n"
							+ "1 = Initializing array with input value" + "\n"
							+ "2 = Printing array" + "\n"
							+ "3 = Summing all elements" + "\n"
							+ "4 = Finding the largest element" + "\n"
							+ "5 = Finding the small index of the largest element" + "\n"
							+ "6 = Random shuffling" + "\n"
							+ "7 = Shifting elements" + "\n"
							+ "8 = Exit";
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, String, "Working with Arrays", JOptionPane.QUESTION_MESSAGE));
										
		return option;
	}

	public static int[] inputValues(int[] array){//*************************************************option 1
						
		for(int i = 0; i < array.length; i++){
			
			array[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Value for " + i + " position:", "Working with arrays", JOptionPane.QUESTION_MESSAGE));			
		}		
		return array;
	}

	public static void printArray(int [] array){//**************************************************option 2
		
		String String = "";
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "   ";
		}
		JOptionPane.showMessageDialog(null, "Values in the Array: " + "\n" + "\n" + String, "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void sumArray(int[] array){//*****************************************************option 3
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			
			sum += array[i];
		}		
		JOptionPane.showMessageDialog(null, "The sum of the array values is " + sum, "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void largestValue(int[] array){//*************************************************option 4
		
		int largest = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] > largest){
				
				largest = array[i];
			}
		}
		JOptionPane.showMessageDialog(null, "The largest value of the array is " + largest, "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void indexLargest(int[] array){//*************************************************option 5
		
		int largest = 0;
		int position = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] > largest){
				
				largest = array[i];
				position = i;
			}
		}
		JOptionPane.showMessageDialog(null, "The smallest index of largest value of the array is " + position, "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void randomShufling(int[] array){//***********************************************option 6
		
		for(int i = 0; i < array.length; i++){
			
			int n;
			int aux;
			do{
				n = (int)(Math.random()*array.length);
			}while(n == i);
			
			aux = array[i];
			array[i] = array[n];
			array[n] = aux;
		}
		JOptionPane.showMessageDialog(null, "Shufled", "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void shiftingValues(int[] array){//***********************************************option 7
		
		int aux = array[0];
		int n = 0;
		
		for(int i = 1; i < array.length; i++){
			
			array[n] = array[i];
			n++;
		}
		array[n] = aux;
		JOptionPane.showMessageDialog(null, "Shifted", "Working with Arrays", JOptionPane.INFORMATION_MESSAGE);		
	}
	
}