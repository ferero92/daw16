public class PrimeWithMethod {

	public static void main(String[] args) {		
		int n = 0;
		int count = 0;
		
		System.out.println("The first 50 prime number: " + "\n");
		
		while(count < 50){
			
			if(isPrime(n)){				
				System.out.print(n + "\t");
				count++;
				if(count % 10 == 0){
					System.out.print("\n");
				}
			}
			n++;			
		}			
	}
	
	public static boolean isPrime(int n){		
		for(int d = 2; d < (n/2 + 1); d++){
			if(n % d == 0){				
				return false;				
			}		
		}
		return true;
	}
}