
public class AsciiTable {

	public static void main(String[] args) {
		
		char a = '!';
									
		for(int i = 1; a <= '~'; i++){
			
			System.out.print("\t" + a + "\t" + "|");
			a++;
			
			if(i % 9 == 0){				
				System.out.println();
			}						
		}
	}
}