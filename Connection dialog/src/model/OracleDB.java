package model;

import java.sql.*;

public class OracleDB {

	protected Connection connection;
	protected String user;
	protected String password;
	protected boolean connect;
	
	public OracleDB(){
		super();
	}
	
	public OracleDB connect(String user, String password){
		
		this.user = user;
		this.password = password;
		
		try{
			Class.forName(new String("oracle.jdbc.OracleDriver"));
			String url = new String("jdbc:oracle:thin:@localhost:1521:XE");
			
			this.connection = DriverManager.getConnection(url, this.user, this.password);
			
			this.connect = true;
			return this;
		}
		catch(Exception e){
			
			this.connect = false;
			return null;
		}
		
	}
	
	public boolean execute(String sql){
		
		try{
			Statement statement;
            statement = this.getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            statement.executeUpdate(sql);
            this.getConnection().commit();
            statement.close();
		}
		catch(Exception e){
			
			return false;
		}
		return true;
	}
	
	public ResultSet query(String sql){
		
		ResultSet result = null;
		try{
			Statement statement;
            statement = getConnection().createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            result = statement.executeQuery(sql);
            getConnection().commit();
		}
		catch(Exception e){
			return null;
		}
		return result;
	}

	//<-----------------------GETTERS AND SETTERS------------------------->
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isConnect() {
		return connect;
	}

	public void setConnect(boolean connect) {
		this.connect = connect;
	}
	
}
