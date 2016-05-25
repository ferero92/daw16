package controller;

import java.io.IOException;

import model.Model;
import view.ViewOld;

public class ControllerOld {

	public static void main(String[] args) {
		
		int menu = 0;
		Model game;
		final int NUMBER_OF_TRIES = 6;
		
		do{
			game = null;			
			boolean exists = true;
			do{
				menu = ViewOld.doMenu();
				exists = true;
				try{
					switch(menu) {
						case 0:	break;
						case 1:	game = new Model();
							break;
						case 2:	game = new Model(ViewOld.selectDictionary());
							break;
						case 3: game = new Model(ViewOld.selectWord());
							break;
						default: game = new Model(10);
					}
				}
				catch(IOException ex){
					ViewOld.error();
					exists = false;
				}
			}while(!(exists));
			do{
				char let = ViewOld.aMove(game, NUMBER_OF_TRIES);
				
				game.move(let);
				
			}while(game.getMistakes() != NUMBER_OF_TRIES && !(game.getWord().equals(game.printMask())));
			
			if(game.getMistakes() == NUMBER_OF_TRIES){
				
				menu = ViewOld.playAgain(game, "You lose");
			}
			else{
				menu = ViewOld.playAgain(game, "You win");
			}			
		}while(menu != 0);

	}
	
}
