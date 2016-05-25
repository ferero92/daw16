package view;

import java.awt.*;
import javax.swing.*;
import model.Model;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;

	private TheMan man;
	private Console console;
	private Model model;
	
	public View(Model model){
		this.setLayout(new GridLayout(1,2));
		
		this.model = model;
		this.man = new TheMan(this.model.getMistakes());
		this.console = new Console();
		
		this.printMask();
		this.setIntroduced();
		
		this.add(this.man);
		this.add(this.console);
	}
	
	//Getters and Setters
	public TheMan getMan() {
		return man;
	}

	public void setMan(TheMan man) {
		this.man = man;
	}

	public Console getConsole() {
		return console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void setIntroduced(){
		
		this.console.getScreen().getIntroduced().setText("Introduced: " + this.model.getIntroduced());
	}
	
	public JTextField getTxt(){
		
		return this.console.getScreen().getResolve().getTxt();
	}
	
	public JButton getSubmit(){
		
		return this.console.getScreen().getResolve().getSubmit();		
	}
	
	public JButton[] getButtons(){
		
		return this.console.getKeyboard().getButtons();
	}
	
	public Points getPoints(){
		
		return this.getMan().getPoints();
	}
	
	//Utilities
	public void printMask(){
		
		this.console.getScreen().getMask().setText(this.model.printMask());
	}
	
	public void updateMan(int mistakes){
				
		Console console = this.getConsole();
		TheMan man = new TheMan(mistakes);
		
		this.remove(this.man);
		this.remove(this.console);
		
		this.man = man;
		this.console = console;
		
		this.add(this.man);
		this.add(this.console);
		
		this.printMask();
		this.setIntroduced();
		
		this.paintAll(this.getGraphics());		
	}
	
	public void move(int position){
				
		Console console = this.getConsole();
		TheMan man = new TheMan(this.model.getMistakes(), position);
		
		this.remove(this.man);
		this.remove(this.console);
		
		this.man = man;
		this.console = console;
		
		this.add(this.man);
		this.add(this.console);
		
		this.paintAll(this.getGraphics());
	}
	
	//Start the program
	public void run() {
		
		this.setTitle("The Hangman");
		this.setSize(1100, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(View.EXIT_ON_CLOSE);
		
	}
	
}
