package view;

import java.awt.*;
import javax.swing.*;

public class FirstPane extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JButton submit;
	private JTextField user;
	private JTextField password;
	private JLabel labelU;
	private JLabel labelP;
	private JPanel panel;
	
	public FirstPane(){
		
		this.setLayout(new BorderLayout());
		
		this.panel = new JPanel();
		this.labelU = new JLabel("Username:");
		this.labelP = new JLabel("Password:");
		this.user = new JTextField(8);
		this.password = new JTextField(8);
		
		this.panel.setLayout(new GridLayout(2, 2));
		this.panel.add(this.labelU);
		this.panel.add(this.user);
		this.panel.add(this.labelP);
		this.panel.add(this.password);
		
		this.submit = new JButton("Submit");
		
		this.add(this.panel);
		this.add(this.submit, BorderLayout.SOUTH);
		
	}

	//<---------------------------GETTERS AND SETTERS---------------------------->
	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

	public JTextField getUser() {
		return user;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JTextField getPassword() {
		return password;
	}

	public void setPassword(JTextField password) {
		this.password = password;
	}

	public JLabel getLabelU() {
		return labelU;
	}

	public void setLabelU(JLabel labelU) {
		this.labelU = labelU;
	}

	public JLabel getLabelP() {
		return labelP;
	}

	public void setLabelP(JLabel labelP) {
		this.labelP = labelP;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

}
