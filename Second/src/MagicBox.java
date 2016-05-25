
public class MagicBox {

	public static void main(String[] args) {
		
		final int MAGIC_BOX = 5;
						
		System.out.println(
							printMatrix(magicBox(MAGIC_BOX)) + "\n" +
							"\n" +
							printArray(sumColumn(magicBox(MAGIC_BOX))) + "\n" +
							printArray(sumRow(magicBox(MAGIC_BOX))) + "\n" +
							sumDiagonal(magicBox(MAGIC_BOX)) + "\n" +
							sumRevDiagonal(magicBox(MAGIC_BOX))									
		);
						
	}
	
	public static int[][] magicBox(int m){//**************************************create a magic box
		
		int[][] matrix = new int[m][m];
		
		for(int n = 1, i = 0, j = m / 2; n <= (Math.pow(m, 2)); i--, j++, n++){
			
			if((n - 1) % m == 0 && n > 1){
				
				i += 2;
				j--;				
			}
			
			if(i < 0){
				i = m - 1;
			}
			
			if(j > (m - 1)){
				j = 0;
			}
			
			matrix[i][j] = n;			
		}
		return matrix;
	}
	
	public static String printMatrix(int[][] matrix){//**************************print the values of a matrix
		
		String String = "";
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				
				String += matrix[i][j] + "\t";
			}
			String += "\n";			
		}						
		return String;
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
	
	public static int[] sumRow(int[][] matrix){//**********************sum the values of the rows in a matrix
		
		int[] sum = new int[matrix.length];
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				
				sum[i] += matrix[i][j];
			}			
		}
		return sum;
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
	
	public static String printArray(int[] array){//********************************************print an array
		
		String String = "";
		
		for(int i = 0; i < array.length; i++){
			
			String += array[i] + "\t";
		}
		return String;
	}

}
