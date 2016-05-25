
public class PositionMap {

	public static void main(String[] args) {
		
		final int POSITIONS_X = 8;
		final int POSITIONS_Y = 2;
		
		int[][] matrixMap = createMap(POSITIONS_X, POSITIONS_Y); 
				
		System.out.println(printMatrix(matrixMap));
		
		double[][] distanceMap = distanceMap(matrixMap);
		
		System.out.println(printMatrix(distanceMap));
		
	}
	
	public static int[][] createMap(int x, int y){
		
		int[][] matrixMap = new int[x][y];
		
		for(int i = 0; i < matrixMap.length; i++){
			for(int j = 0; j < matrixMap[0].length; j++){				
				matrixMap[i][j] = (int) (Math.random() * 10);
			}
		}
		return matrixMap;
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
	
	public static String printMatrix(double[][] matrix){//************print the values of a matrix of doubles
		
		String String = "";
		
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
				
				if(matrix[i][j] > 0)
					String += matrix[i][j] + "\t";
				else{
					if(matrix[i][j] < 0){
						String += "-";
					}
				}
			}
			String += "\n" + "\n";
		}
		return String;
	}
	
	public static double calculateDistance(int c1, int c2){
						
		double distance = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));
						
		return distance;
	}
			
	public static double[][] distanceMap(int[][] matrixMap){
	
		double[][] distanceMap = new double[matrixMap.length][matrixMap.length];
		
		for(int i = 0; i < distanceMap.length; i++){
			for(int j = 0; j < distanceMap[0].length; j++){
				if(i == j){
					distanceMap[i][j] = -1.0;
				}
				else{
					if(i > j){
						distanceMap[i][j] = calculateDistance((matrixMap[i][0] - matrixMap[j][0]), (matrixMap[i][1] - matrixMap[j][1]));
						distanceMap[i][j] = (int)(distanceMap[i][j] * 100);
						distanceMap[i][j] /= 100;
					}
				}
			}
		}		
		return distanceMap;
	}
	
}
