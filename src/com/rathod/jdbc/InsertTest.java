package com.rathod.jdbc;
//STEP 1. Import required packages
import java.sql.*;

	public class InsertTest {
	// JDBC database URL
		   static final String DB_URL = "jdbc:oracle:thin:@172.16.3.94:1521:BPSFCSSR";

	//  Database credentials
		   static final String USER = "FCL_DIT_OWNER";
		   static final String PASS = "FCL_DIT_OWNER";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
	//STEP 2: Register JDBC driver
		      Class.forName("oracle.jdbc.driver.OracleDriver");

	//STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	//STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();
		      String sql;
		      //sql = "insert into Employee values('5','Shyam','Solanki','Dadar','Mumbai')";
		      //sql = "delete from  Employee where eid='5'";
		      sql = "Update Employee set firstName='Raju' where eid=3";
		      int res = stmt.executeUpdate(sql);	
	
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{		    	
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
	}//end FirstExample
	
	
	
	/*
MySQL	com.mysql.jdbc.Driver	jdbc:mysql://hostname/ databaseName	
ORACLE	oracle.jdbc.driver.OracleDriver	jdbc:oracle:thin:@hostname:port Number:databaseName
DB2	COM.ibm.db2.jdbc.net.DB2Driver	jdbc:db2:hostname:port Number/databaseName
Sybase	com.sybase.jdbc.SybDriver	jdbc:sybase:Tds:hostname: port Number/databaseName
	 */