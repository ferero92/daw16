package ed;

public class Example {

	public static void main(String[] args) {
		
		int suma = 0;		
		int producto = 1;
		
		for(int i = 1; i <= 10; i++){
			
			suma += i;
			producto *= i;
		}
						
		ver();
		System.out.println("El resultado de la suma es: " + suma + " y el del producto es: " + producto);

	}
	
	public static void ver(){
		
		System.out.println("primera linea");
		System.out.println("segunda linea");
		System.out.println("tercera linea");
	}

}
