import javax.swing.JOptionPane;
public class WorkingBidimensionalArray {

	public static void main(String[] args) {
		
		int row = Integer.parseInt(JOptionPane.showInputDialog(null, "Value for rows:", "Working Bidimensional Arrays", JOptionPane.QUESTION_MESSAGE));
		int column = Integer.parseInt(JOptionPane.showInputDialog(null, "Value for columns:", "Working Bidimensional Arrays", JOptionPane.QUESTION_MESSAGE));
		int[][] matrix = createMatrix(row, column);
		
		int menu = 0;
		int value = 0;
		int[] sum;
		
		do{
			menu = doMenu();
			
			switch(menu){
				case 1: JOptionPane.showMessageDialog(null, "The Matrix" + "\n" + printMatrix(matrix), "Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2: value = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the value that you want to find", "Working Bidimensional Arrays", JOptionPane.QUESTION_MESSAGE));
						JOptionPane.showMessageDialog(null, "The position of the value " + value + "\n" + 
						printMatrix(findMatrix(matrix, value)),"Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3: shufflingMatrix(matrix);
						JOptionPane.showMessageDialog(null, "Shuffling...", "Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4: sum = sumColumn(matrix);
						JOptionPane.showMessageDialog(null, "The sum of the values of each column:" + "\n" + printArray(sum), "Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5: if(row != column){
							JOptionPane.showMessageDialog(null, "Row and Column must be equal to do this option", "Working Bidimensional Arrays", JOptionPane.WARNING_MESSAGE);
						}
						else{
							JOptionPane.showMessageDialog(null, "The sum of the values of the main diagonal is: " + sumDiagonal(matrix), "Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
						}
					break;
				case 6: if(row != column){
							JOptionPane.showMessageDialog(null, "Row and Column must be equal to do this option", "Working Bidimensional Arrays", JOptionPane.WARNING_MESSAGE);
						}
						else{
							JOptionPane.showMessageDialog(null, "The sum of the other diagonal is: " + sumRevDiagonal(matrix), "Working Bidimensional Arrays", JOptionPane.INFORMATION_MESSAGE);
						}	
					break;
				case 7: break;
					default: JOptionPane.showMessageDialog(null, "Incorret value. Please try again", "Bidimensional Array", JOptionPane.WARNING_MESSAGE);
			}						
		}while(menu != 7);

	}
	
	public static int[][] createMatrix(int row, int column){//*********Initializing matrix with random values
				
		int[][] matrix = new int [row][column];
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				
				matrix[i][j] = (int)(Math.random()* 9 + 1);
			}			
		}						
		return matrix;
	}
	
	public static int doMenu(){//*********************************************************menu of the program
		
		String String = "Welcome to Working Bidimensional Arrays, please select an option:" + "\n"
							+ "\n"							
							+ "1 = Printing matrix" + "\n"
							+ "2 = Finding a value in the matrix" + "\n"
							+ "3 = Random shuffling" + "\n"
							+ "4 = Summing all columns" + "\n"
							+ "5 = Summing the main diagonal" + "\n"
							+ "6 = Summing the other diagonal" + "\n"
							+ "7 = Exit";
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, String, "Working Bidimensional Arrays", JOptionPane.QUESTION_MESSAGE));
										
		return option;
	}
	
	public static String printMatrix(int[][] matrix){//**************************print the values of a matrix
		
		String String = "";
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				
				String += matrix[i][j] + "  ";
			}
			String += "\n";			
		}						
		return String;
	}
	
	public static int[][] findMatrix(int[][] matrix, int x){//*******find the position of a value in a matrix
		
		int[][] finder = new int[matrix.length][matrix[0].length];
		
		for(int i = 0; i < finder.length; i++){
			for(int j = 0; j < finder[i].length; j++){
				if(matrix[i][j] == x){
					finder[i][j] = 1;
				}				
			}
		}
		return finder;
	}
	
	public static void shufflingMatrix(int[][] matrix){//**************random shuffling of values in a matrix
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){			
				int aux;				
				int n = (int)(Math.random() * matrix.length);
				int m = (int)(Math.random() * matrix[i].length);
							
				aux = matrix[i][j];
				matrix[i][j] = matrix[n][m];
				matrix[n][m] = aux;
			}
		}		
	}
	
	public static int[] sumColumn(int[][] matrix){//****************sum the values of the columns in a matrix
		
		int[] sum = new int[matrix[0].length];
		
		for(int j = 0; j < sum.length; j++){
			for(int i = 0; i < matrix.length; i++){
				sum[j] += matrix[i][j];				
			}
		}		
		return sum;
	}
	
	public static String printArray(int[] array){//********************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "  ";
		}
		return String;
	}
						
	public static int sumDiagonal(int[][] matrix){//**********sum the values of the main diagonal in a matrix
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++){
			
			sum += matrix[i][i];
		}
		
		return sum;
	}
	
	public static int sumRevDiagonal(int[][] matrix){//******sum the values of the other diagonal in a matrix
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++){
			
			
			sum += matrix[i][(matrix.length - 1) - i];
		}		
		return sum;
	}


}
