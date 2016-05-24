package controller;

import java.awt.event.*;
import model.Model;
import view.View;

public class Controller implements ActionListener{

	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		
		this.model = model;
		this.view = view;		
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {

		String driver = new String((String)this.view.getDriver().getSelectedItem());
		String url = new String((String)this.view.getUrl().getSelectedItem());
		String user = new String(this.view.getUser().getText());
		String password = this.convertPassword();
		
		this.model.connect(driver, url, user, password);
		
		if(this.model.isConnect()){
			
			this.view.getStateof().setText("Connected");
		}
		
	}
	
	public void addActionListeners(){
		
		this.view.getSubmit().addActionListener(this);
	}
	
	public String convertPassword(){
		
		char[] pass = this.view.getPassword().getPassword();
		String word = new String();
		
		for(int i = 0; i < pass.length; i++){
			word += pass[i];
		}
		
		return word;
	}

}
