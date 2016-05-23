package test;

import model.OracleDB;

public class TestOracleDB {
	
	public static void main(String[] args) {
		
		OracleDB db = new OracleDB();
		db.connect("hr", "hr");
		
		if(db.isConnect())
			System.out.println("ok");
		else
			System.out.println("error");
		
	}

}
