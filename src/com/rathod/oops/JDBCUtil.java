package com.rathod.oops;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	static Connection con=null;
	
	
	public static Connection getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				}
		catch (Exception e) {
			return con=null;
		}
		return con;
	}
	
	public static void cleanUp(){
		
	}

}
