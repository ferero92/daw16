package ed;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeeFichero {
/**
* @param args
* @throws IOException
*/
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("c:/tutor.txt");
		BufferedReader bf = new BufferedReader(fr);
		String sCadena;
		
		while ((sCadena = bf.readLine())!=null) {
			System.out.println(sCadena);
		}
		bf.close();
	}
	
}
