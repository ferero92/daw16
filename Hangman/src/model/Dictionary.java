package model;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Dictionary {
	
	private File book;
	
	public Dictionary(int language){
		
		String string = new String();
		
		switch(language) {
			case 1:	string += "castellano.txt";				
				break;
			case 2:	string += "english.txt";
				break;
			case 3: string += "italiano.txt";
				break;
			case 4: string += "français.txt";
				default:break;
		}		
		book = new File(string);
	}
	
	public String getRandomDictionary() throws IOException{
		
		Scanner scanner = new Scanner(book);
		
		ArrayList<String> list = new ArrayList<>();
		
		while(scanner.hasNext()){
			
			list.add(scanner.next());
		}
		
		int index = (int)(Math.random() * list.size());
		
		scanner.close();
		
		return new String(list.get(index));
	}

}
