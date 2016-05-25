package ed;

import ed.Account;

public class Bank {
	
	private int numberOfAccounts;	
	private Account[] bank;
		
	public Bank(int size){
		
		bank = new Account[size];
		numberOfAccounts = 0;
	}
	
	public Account getAccount(int id){
		
		if(isSearch(id) == -1){			
			return null;
		}
		else{
			return bank[isSearch(id)];
		}
	}
	
	public int getNumberOfAccounts(){
		
		return this.numberOfAccounts;
	}
	
	public boolean createAccount(int id, String name, double balance){
		
		if(!isValue(id)){
			bank[numberOfAccounts] = new Account(id, name, balance);
			numberOfAccounts++;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isValue(int id){
		
		for(int i = 0; i < bank.length; i++){
			
			if(isSearch(id) == -1){
				return false;
			}
		}
		return true;
	}
	
	public int isSearch(int id){
		
		for(int i = 0; i < bank.length; i++){
			
			if(bank[i].getId() == id){
				return i;
			}
		}
		return -1;
	}
	
	public void deleteAccount(int id){
		
		bank[isSearch(id)] = null;
		
		for(int i = 0; i < numberOfAccounts; i++){
			
			if(bank[i] == null){
				
				bank[i] = bank[i + 1];
			}
		}		
	}
	
	public String toString(){
		
		String String = "";
		
		for(int i = 0; i < numberOfAccounts; i++){
			
			String += 	"--------------------" + "\n" +
						bank[i].toString() + "\n";
		}
		return String;
	}

}
