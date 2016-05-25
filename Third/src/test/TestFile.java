package test;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		
		File file = new File("c:\\Users\\Fernando");
		
		File[] folder = file.listFiles();
		
		String string = "";
		
		for(int i = 0; i < folder.length; i++){
			
			string += folder[i].getName();
			
			if(folder[i].isDirectory()){
				string += " is a directory\n";
			}
			else{
				 string += " is a file\n";
			}
		}		
		System.out.println(string);

	}

}
