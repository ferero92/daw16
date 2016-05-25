package ed;

public class MultiplicarSumar {
	
	public static void main(String[] args) {
		
		int suma =0, producto =1;
		
		for (int i=1;i<=10;i++){
			suma= suma + i;
			producto = producto* i;
		}
		
		System.out.println("valor del producto "+producto);
		
		producto(suma);
		
		System.out.println("valor de la suma "+ suma);	

	}	
	
	public static int producto(int n){
		
		return n * 3;
	}

}
