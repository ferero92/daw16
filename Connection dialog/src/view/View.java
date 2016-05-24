package view;

import java.awt.*;
import javax.swing.*;
import model.Driver;
import model.Url;

public class View extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JComboBox<String> driver;
	private JComboBox<String> url;
	private JTextField user;
	private JPasswordField password;
	private JLabel stateof;
	private JButton submit;
	
	public View(){
		
		this.setLayout(new GridLayout(5, 2, 10, 10));
		
		this.driver = new JComboBox<String>(new Driver().drivers());
		this.url = new JComboBox<String>(new Url().url());
		this.user = new JTextField(5);
		this.password = new JPasswordField(5);
		this.stateof = new JLabel("No connection");
		this.submit = new JButton("Connect to DB");
		
		this.add(new JLabel("JDBC Driver"));
		this.add(this.driver);
		this.add(new JLabel("Database URL"));
		this.add(this.url);
		this.add(new JLabel("Username"));
		this.add(this.user);
		this.add(new JLabel("Password"));
		this.add(this.password);
		this.add(this.stateof);
		this.add(this.submit);
		
	}
	
	public void run(){
		
		this.setTitle("Connection dialog");
		this.setSize(350, 200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//<----------------------GETTERS AND SETTERS------------------------>
	public JComboBox<String> getDriver() {
		return driver;
	}

	public void setDriver(JComboBox<String> driver) {
		this.driver = driver;
	}

	public JComboBox<String> getUrl() {
		return url;
	}

	public void setUrl(JComboBox<String> url) {
		this.url = url;
	}

	public JTextField getUser() {
		return user;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public void setPassword(JPasswordField password) {
		this.password = password;
	}

	public JLabel getStateof() {
		return stateof;
	}

	public void setStateof(JLabel stateof) {
		this.stateof = stateof;
	}

	public JButton getSubmit() {
		return submit;
	}

	public void setSubmit(JButton submit) {
		this.submit = submit;
	}

}
