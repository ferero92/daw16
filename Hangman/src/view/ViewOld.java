package view;

import javax.swing.JOptionPane;

import model.Model;

public class ViewOld {
	
	public static int doMenu(){
		
		return Integer.parseInt(JOptionPane.showInputDialog(null,
					"Welcome to Hangman, a culinary game. Please select an option\n" +
					"\n" +
					"     1: Launch the game with default options\n" +
					"     2: Select the language\n" +
					"     3: Select the word to play\n" +
					"     0: Exit\n "
				));
	}
	
	public static int selectDictionary(){
		
		return Integer.parseInt(JOptionPane.showInputDialog(null,
					"Select a country:\n" +
					"\n" +
					"     1: Spain\n" +
					"     2: USA\n" +
					"     3: Italy\n" +
					"     4: France\n "
				));
	}
	
	public static void error(){
		
		JOptionPane.showMessageDialog(null, "Error to launch the game. Please choose a correct option");
	}
	
	public static String selectWord(){
		
		return JOptionPane.showInputDialog(null, "Type the word with you want to play:");
	}
	
	public static char aMove(Model game, int tries){
		
		return (JOptionPane.showInputDialog(null,					
					"       " + game.printMask() +
					"\n Tries: " + (tries - game.getMistakes()) +
					"\n Introduced letters: " + game.getIntroduced() +
					"\n "
				)).charAt(0);
	}
	
	public static int playAgain(Model game, String string){
		
		int option = JOptionPane.showConfirmDialog(null, string + ". The word was " + game.getWord() + "\n\nPlay again?");
		
		if(option == JOptionPane.OK_OPTION){
			return 1;
		}
		else{
			return 0;
		}		
	}

}
