package com.rathod.jdbc;
//STEP 1. Import required packages
import java.sql.*;
public class JDBCSimpleEx {
// JDBC driver name and database URL
	   //static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
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
	      sql = "SELECT Eid, firstName, lastName, address, city FROM Employee";
	      ResultSet rs = stmt.executeQuery(sql);

//STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	         int id  = rs.getInt("eid");	         
	         String first = rs.getString("firstName");
	         String last = rs.getString("lastName");
	         String city = rs.getString("city");

	         //Display values
	         System.out.print("ID: " + id);
	         System.out.print(", city: " + city);
	         System.out.print(", First Name: " + first);
	         System.out.println(", Last Name : " + last);
	      }
//STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
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