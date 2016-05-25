public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 1;
		int count = 0;
		boolean prime = true;
		
		while(count < 50){
			for(int d = 2; d < (n/2 +1); d++){				
				if(n % d == 0){
					prime = false;
					break;
				}
			}
			if(prime){
				System.out.print(n + "\t");
				count++;
				if(count % 10 == 0){
				System.out.print("\n");
				}
			}			
			n++;			
			prime = true;						
		}		
	}
}