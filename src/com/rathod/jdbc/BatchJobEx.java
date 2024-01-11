package com.rathod.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchJobEx {
	static final String DB_URL = "jdbc:oracle:thin:@172.16.3.94:1521:BPSFCSSR";

	//  Database credentials
	   static final String USER = "FCL_DIT_OWNER";
	   static final String PASS = "FCL_DIT_OWNER";

	public static void main(String[] args) throws SQLException {

		   Connection conn = null;
		   Statement stmt = null;
		try{
			System.out.println("Start...");
		   //Assume a valid connection object conn
			
		   System.out.println(" get driver...");
		   Class.forName("oracle.jdbc.driver.OracleDriver");
		   
		   System.out.println("Connecting to database...");
		   conn = DriverManager.getConnection(DB_URL,USER,PASS);
	    	// Create statement object
		   stmt = conn.createStatement();

		   // Set auto-commit to false
		   conn.setAutoCommit(false);

		   // Create SQL statement
		   String SQL = "INSERT INTO Employee (eid, firstName, lastName, city) " +
		                "VALUES(8,'Zia', 'Ali', 'Pune')";
		   // Add above SQL statement in the batch.
		   stmt.addBatch(SQL);

		   // Create one more SQL statement
		   SQL = "INSERT INTO Employee (eid, firstName, lastName, city) " +
		                "VALUES(9,'Raj', 'Kumar', 'Nagar')";
		   // Add above SQL statement in the batch.
		   stmt.addBatch(SQL);

		   // Create one more SQL statement
		   SQL = "UPDATE Employee SET city = 'AhamadNagar' WHERE eid = 9";
		   // Add above SQL statement in the batch.
		   stmt.addBatch(SQL);

		   // Create an int[] to hold returned values
		   int[] count = stmt.executeBatch();
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			//Explicitly commit statements to apply changes
			   conn.commit();
		}		   
	}		
}
