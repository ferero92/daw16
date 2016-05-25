
public class Methods {
	
	public static int[] copyArray(int[] array){//*******************************************copy for an array
		
		int[] copy = new int [array.length];
		
		for(int i = 0; i < array.length; i++){
			
			copy[i] = array[i];
			
		}		
		return copy;
	}

	public static int numberDigits(int number){//********************count the number of digits in an integer
		
		int digits = 0;
		
		do{
			number /= 10;
			digits++;
			
		}while(number != 0);
		
		return digits;		
	}
	
	public static int revInteger(int number){//******************************return the reverse of an integer
		
		int reverse = 0;
				
		for(int i = numberDigits(number); number >= 0; i--){
			reverse += (number % 10 * Math.pow(10, i - 1));
			number /= 10;
		}		
		return reverse;
	}
	
	public static int sumArray(int[] array){//***********************************sum the elements in an array
		
		int sum = 0;
		
		for(int i = 0; i < array.length; i++){
			
			sum += array[i];
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
	
	public static void revArray(int[] array){//****************************returns us the reverse of an array
		
		int aux = 0;
		
		for(int i = 0, j = array.length - 1; i <= j; i++, j--){
			
			aux = array[i];
			array[i] = array[j];
			array[j] = aux;
		}
	}
	
	public static int searchValue(int[] array, int x){//**************************search the index of a value
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	public static boolean isValue(int[] array, int x){//***************************is the value in the array?
		
		if(searchValue(array, x) == -1){
			return false;
		}
		return true;
	}
	
	public static int countValue(int[] array, int x){//******************counts the times that a value appear
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] == x){
				count++;
			}
		}
		return count;
	}
	
	public static int[] indexValue(int[] array, int x){//**********************returns the index of the value
		
		if(! isValue(array, x)){
			return null;
		}
		
		int[] position = new int[countValue(array, x)];
		int j = 0;
		
		for(int i = 0; i < array.length; i++){
			
			if(array[i] == x){
				position[j++] = i;
			}
		}
		return position;
	}
	
	public static int binarySearch(int[] array, int x){//****************binary search of a value in an array
		
		int i = 0;
		int end = array.length - 1;
		int middle = 0;
		
		do{
			middle = (i + end) / 2;
			
			if(array[middle] != x){
				
				if(x < array[middle]){
					
					end = middle - 1;
				}
				
				else{
					
					i = middle + 1;
				}
			}
			else{
				return middle;
			}			
			
		}while(i <= end);
						
		return -1;
	}
	
	public static void bubble(int[] array){//*********************************to order the values in an array
		
		for(int i = 0; i < array.length - 2; i++){						
			
			for(int j = array.length - 2; j >= i; j--){
				if(array[j] > array[j + 1]){
					
					int aux = array[j + 1];
					array[j + 1] = array[j];
					array[j] = aux;					
				}
			}			
		}						
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
	
	public static int[][] createMatrix(int row, int column){//*********Initializing matrix with random values
		
		int[][] matrix = new int [row][column];
		
		for(int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				
				matrix[i][j] = (int)(Math.random()* 9 + 1);
			}			
		}						
		return matrix;
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
	
	public static int[][] doABarrelRoll(int[][] matrix){//********************turn a matrix to right
		
		int[][] roll = new int[matrix[0].length][matrix.length];
		
		for(int i = 0, c = 0; i < roll.length; i++, c++){
			for(int j = 0, r = matrix.length - 1; j < roll[0].length; j++, r--){
				
				roll[i][j] = matrix[r][c];				
			}						
		}		
		return roll;
	}
	
	public static int[][] zoomIt(int[][] matrix, int zoom){//******************do a zoom to a matrix
		
		int[][] mZoom = new int[matrix.length * zoom][matrix[0].length * zoom];
		int r = 0;		
		
		for(int i = 0; i < mZoom.length; i++){
			int c = 0;
			if(i % zoom == 0 && i > 0){
				r++;
			}
			for(int j = 0; j < mZoom[0].length; j++){				
				if(j % zoom == 0 && j > 0){
					c++;
				}
				mZoom[i][j] = matrix[r][c];
			}			
		}					
		return mZoom;
	}
	
	public static boolean isValue(int[][] matrix, int value){//*************find a value in a matrix
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == value){
					return true;
				}
			}
		}
		return false;
	}
	
	public static int generateOperand(int n){//**************A random number with a number of digits
		
		int number = (int)(Math.random() * (Math.pow(10, n) - Math.pow(10, n - 1)) + Math.pow(10, n - 1));
		
		return number;
	}
	
}
