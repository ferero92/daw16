package model;

public class Player {
	
	public static int numberPlayers = 0;;
	
	private String name;
	private double result;
	
	public Player(){
		this(new String("Player" + numberPlayers));
	}
		
	public Player(String name){
		this.name = name;
		this.result = 0.0;
		numberPlayers++;
	}
	
	public String getName() {
		return name;
	}

	public double getResult() {
		return result;
	}
	
	public void setResult(double result) {
		this.result = result;
	}

}
