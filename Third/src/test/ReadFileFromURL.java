package test;

import java.net.URL;
import java.net.MalformedURLException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileFromURL {

	public static void main(String[] args) {
				
		System.out.println("Enter a URL:");
		Scanner scanner = new Scanner(System.in);
		String web = new String(scanner.next());
		scanner.close();		
				
		try{
			URL url = new URL(web);			
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while(input.hasNext()){
				String line = new String(input.nextLine());
				count += line.length();
			}
			System.out.println("The file size is " + count + " bytes");	
			input.close();
		}
		catch(MalformedURLException ex){
			System.out.println("Invalid URL");
		}
		catch(IOException ex){
			System.out.println("I/O Errors: no such file");
		}

	}

}
