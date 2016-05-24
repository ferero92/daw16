package model;

import java.sql.DriverManager;

public class Model extends OracleDB{
	
	private String driver;
	private String url;
	
	public Model(){
		super();
	}
	
	public Model connect(String driver, String url, String user, String password){
		
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
		
		try{
			Class.forName(this.driver);
			
			this.connection = DriverManager.getConnection(this.url, this.user, this.password);
			
			this.connect = true;
			return this;
		}
		catch(Exception e){
			
			this.connect = false;
			return null;
		}
		
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
