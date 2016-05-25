package test;

import java.util.Scanner;
import java.io.File;

public class ReadData {

	public static void main(String[] args) {
		
		File file = null;
		Scanner input = new Scanner(System.in);
		
		do{
			System.out.println("Introduced the name of the file:");
			String name = new String(input.next());
			file = new File(name);
			try{
				input = new Scanner(file);
			}
			catch(Exception ex){
				System.out.println("File not found. Try again");
			}
		}while(!(file.exists()));
		
		
		while(input.hasNext()){
			String message = input.next();
			System.out.println(message);
		}
		
		input.close();

	}

}
