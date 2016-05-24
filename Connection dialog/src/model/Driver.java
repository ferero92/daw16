package model;

public class Driver {
	
	public static final String ORACLE = new String("oracle.jdbc.OracleDriver");
	public static final String MYSQL = new String("com.mysql.jdbc.Driver");
	
	public Driver(){		
		super();		
	}
	
	public String[] drivers(){
		
		return new String[]{Driver.ORACLE, Driver.MYSQL};
	}

}
