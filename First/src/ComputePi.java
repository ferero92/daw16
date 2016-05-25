
public class ComputePi {

	public static void main(String[] args) {
		
		for(int i = 10000; i <= 100000; i+=10000){
			double pi = 0;
			
			for(int n = 1; n <= i; n++){			
				pi += Math.pow(-1, n + 1) / (2 * n - 1);				
			}
			
			pi = (pi * 4);
			System.out.println("Si i es igual a " + i + " entonces pi vale " + pi);
		}
	}
}
