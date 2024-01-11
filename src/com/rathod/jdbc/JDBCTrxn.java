package com.rathod.jdbc;

import java.sql.*;

public class JDBCTrxn {
	static final String DB_URL = "jdbc:oracle:thin:@172.16.3.94:1521:BPSFCSSR";

	//  Database credentials
	   static final String USER = "FCL_DIT_OWNER";
	   static final String PASS = "FCL_DIT_OWNER";

	public static void main(String[] args) {

		   Connection conn = null;
		   Statement stmt = null;
		try{
			System.out.println("Start...");
		   //Assume a valid connection object conn
			
		   System.out.println(" get driver...");
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   System.out.println("Connecting to database...");
		   conn = DriverManager.getConnection(DB_URL,USER,PASS);
		   stmt = conn.createStatement();
		   conn.setAutoCommit(false);
		   String SQL = "INSERT INTO Employee VALUES (6, 'pradhan', 'Rita', 'Tezpur','Tezpur')";
		   stmt.executeUpdate(SQL);  
		   //Submit a malformed SQL statement that breaks
		   String SQL1 = "INSERTd IN Employee VALUES (8, 'Siyaram', 'Sita', 'Singh wadi','Tezpur')";
		   stmt.executeUpdate(SQL1);
		   // If there is no error.
		   conn.commit();
		}catch(SQLException se){
		   // If there is any error.
		   se.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.rollback();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
