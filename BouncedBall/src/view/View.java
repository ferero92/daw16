package view;

import java.awt.*;
import javax.swing.*;
import model.Model;
import controller.Controller;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private Model model;
	private JPanel buttons;
	private JButton start;
	private JButton stop;
	
	public View(Model model){
		
		this.setLayout(new BorderLayout());
		
		this.buttons = new JPanel();
		this.buttons.setLayout(new GridLayout(1,2));
		this.start = new JButton("start");
		this.stop = new JButton("stop");
		this.buttons.add(start);
		this.buttons.add(stop);
		
		this.model = model;
		
		this.add(this.buttons, BorderLayout.SOUTH);
		this.add(this.model);
		
	}

	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public JButton getStart() {
		return start;
	}

	public JButton getStop() {
		return stop;
	}

	public void setController(Controller controller){
		
		Timer timer = new Timer(80, controller);
		timer.start();
		
	}
	
	public void run(){
		
		this.setTitle("Bounced Ball");
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
