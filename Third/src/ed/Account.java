package ed;

import java.util.Date;

public class Account {

	private int id;
	private String name;	
	private Date createDate;
	private double balance;
	
	public Account(int id, String name, double balance){
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		createDate = new Date();
	}
	
	public int getId(){
		
		return this.id;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public double getBalance(){
		
		return this.balance;
	}
	
	public Date getCreateDate(){
		
		return this.createDate;
	}
	
	public void deposit(double amount){
		
		balance += amount;
	}
	
	public boolean withdraw(double amount){
		
		if(balance > amount){
			balance -= amount;
			return true;
		}
		else{
			return false;
		}
	}
	
	public String toString(){
		
		return 	"Account number: " + getId() + "\n" +
				"Owner: " + getName() + "\n" +
				"Created: " + getCreateDate() + "\n" +
				"Balance: " + getBalance();
	}
	
}
