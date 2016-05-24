package model;

public class Url {
	
	public static final String ORACLE = new String("jdbc:oracle:thin:@localhost:1521:XE");
	public static final String MYSQL = new String("jdbc:mysql://localhost/javabook");
	
	public Url(){
		super();
	}
	
	public String[] url(){
		
		return new String[]{Url.ORACLE, Url.MYSQL};
	}

}
