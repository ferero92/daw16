package view;

import java.awt.*;
import javax.swing.*;

public class Screen extends JPanel {

	private static final long serialVersionUID = 1L;

	private JLabel introduced;
	private Resolve resolve;
	private JLabel mask;
	
	public Screen(){
		
		this.setLayout(new BorderLayout());
		
		this.introduced = new JLabel("Introduced: ");
		this.mask = new JLabel();
		this.resolve = new Resolve();		
		
		this.add(this.introduced, BorderLayout.NORTH);
		this.add(this.mask, BorderLayout.CENTER);
		this.add(this.resolve, BorderLayout.SOUTH);
		
	}
	
	//Getters and Setters
	public Resolve getResolve() {
		return resolve;
	}

	public void setResolve(Resolve resolve) {
		this.resolve = resolve;
	}

	public JLabel getMask() {
		return mask;
	}

	public void setMask(JLabel mask) {
		this.mask = mask;
	}

	public JLabel getIntroduced() {
		return introduced;
	}

	public void setIntroduced(JLabel introduced) {
		this.introduced = introduced;
	}

}
