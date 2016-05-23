package view;

import java.awt.*;
import javax.swing.*;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private FirstPane first;
	
	public View(){
		
		this.setLayout(new BorderLayout());
		
		this.first = new FirstPane();
		
		this.add(this.first);
		
	}
	
	public void run(){
		
		this.setTitle("Oracle");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	public void runagain(){
		
		this.remove(this.first);
		
		this.setTitle("Departments");
		this.setSize(300, 500);
		this.setLocationRelativeTo(null);
		
		this.add(new JLabel("ok"));		
	}

	//<----------------------GETTERS AND SETTERS--------------------->
	public FirstPane getFirst() {
		return first;
	}

	public void setFirst(FirstPane first) {
		this.first = first;
	}

}
