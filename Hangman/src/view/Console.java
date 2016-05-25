package view;

import java.awt.*;
import javax.swing.*;

public class Console extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Screen screen;
	private Keyboard keyboard;
	
	public Console(){		
		this.setLayout(new GridLayout(2,1));
		
		this.screen = new Screen();
		this.keyboard = new Keyboard();
		
		this.add(screen);
		this.add(keyboard);
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

}
