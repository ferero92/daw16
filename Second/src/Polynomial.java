import javax.swing.JOptionPane;
public class Polynomial {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Welcome to Polynomial. Please introduce two polynomials");
		
		int[] poly1 = createPoly();
		int[] poly2 = createPoly();
		
		int menu = 0;
		
		do{
			menu = doMenu();
			
			switch (menu) {
				case 1: int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Value for x:"));
						JOptionPane.showMessageDialog(null, "Value for the first polynomial: (x = " + x + ")" + "\n"
								+ printPoly(poly1) 
								+ " = " + evaluateX(poly1, x));
						JOptionPane.showMessageDialog(null, "Value for the second polynomial: (x = " + x + ")" + "\n"
								+ printPoly(poly2) 
								+ " = " + evaluateX(poly2, x));					
					break;
				case 2: JOptionPane.showMessageDialog(null, printPoly(poly1) + "\n" + "+ " + printPoly(poly2) + "\n" + "= " + printPoly(sumPoly(poly1,poly2)));
					break;
				case 3: JOptionPane.showMessageDialog(null, printPoly(poly1) + "\n" + "- (" + printPoly(poly2) + ")" + "\n" + "= " + printPoly(subtractionPoly(poly1,poly2)));
					break;
				case 4:break;	
				default:JOptionPane.showMessageDialog(null, "Incorrect option. Please try again.");					
			}									
		}while(menu != 4);

	}
	
	public static int[] createPoly(){
		
		int n = gradePoly();
		
		int[] poly = new int[n + 1];
		
		for(int i = n; i >= 0; i--){
			
			poly[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Value for grade " + i + ":"));
			
		}		
		return poly;
	}
	
	public static int gradePoly(){
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Grade of the polynomial:"));
		
		return n;
	}
	
	public static int doMenu(){
		
		int option = Integer.parseInt(JOptionPane.showInputDialog(null, 
					"Please select an option:" + "\n"
						+ "1 = Evaluate x for a value" + "\n"
						+ "2 = Sum of the polynomials" + "\n"
						+ "3 = Subtraction of the polynomials" + "\n"
						+ "4 = Exit"));		
		return option;
	}
	
	public static int evaluateX(int[] poly, int x){
		
		int value = 0;
		
		for(int i = 0; i < poly.length; i++){
			
			value += poly[i] * Math.pow(x, i); 
		}				
		return value;
	}
	
	public static int isBigger(int[] poly1, int[] poly2){
		
		int n = 0;
		
		if(poly1.length > poly2.length){
			n = poly1.length;
		}
		else{
			n = poly2.length;
		}
		return n;
	}
	
	public static int[] equalLength(int[] array, int length){
		
		int[] aux = new int[length];
		
		for(int i = 0; i < array.length; i++){
			aux[i] = array[i];
		}		
		return aux;
	}
	
	public static int[] sumPoly(int[] poly1, int[] poly2){
					
		int[] aux1 = equalLength(poly1, isBigger(poly1, poly2));
		int[] aux2 = equalLength(poly2, isBigger(poly1, poly2));
		
		for(int i = 0; i < aux1.length; i++){
												
			aux1[i] += aux2[i];						
		}				
		return aux1;
	}
	
	public static int[] subtractionPoly(int[] poly1, int[] poly2){
		
		int[] aux1 = equalLength(poly1, isBigger(poly1, poly2));
		int[] aux2 = equalLength(poly2, isBigger(poly1, poly2));
		
		for(int i = 0; i < aux1.length; i++){
												
			aux1[i] -= aux2[i];						
		}				
		return aux1;
	}		
	
	public static String printPoly(int[] array){
		
		String String = "";
		
		for(int i = (array.length - 1); i >= 0; i--){
			
			if(array[i] == 0){
				continue;
			}
			else{	
				if(array[i] < 0 || i == (array.length - 1) && array[i] != 1){				
					String += array[i];										
				}
				else{
					if(array[i] > 1 || i == 0){
						String += "+" + array[i];
					}					
				}
			}
			
			if(i == 1){
				String += "x";
			}
			else{
				if(i > 1){
					String += "x" + i;
				}				
			}
			
			String += " ";						
		}
		return String;
	}

}
