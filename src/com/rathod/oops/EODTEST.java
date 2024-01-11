package com.rathod.oops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

public class EODTEST {
	
	public static List<HashMap<String,Object>> fetchValues() throws Exception {
		ResultSet resultset=null;
		 HashMap<String,Object> hmOutParam = null;
		 List<HashMap<String,Object>> listResult =  null;
		 ResultSetMetaData rsmdResultSetMetaData=null;
		 Connection con=SampleRetry.getConnection();
			String timeValue;
			PreparedStatement ps=null;
		 int numberOfRows = 0;
			try{
				String sql="select ETL_ACQ_NOT as ETLFLAG, OFFICE_ID as OFFICE_ID from EOD_MSG_Details where  OFFICE_ID in('GB1','GI1','CY1') and MESSAGE_TIME in (?)";
				ps=con.prepareStatement(sql);
				ps.setString(1,"27-AUG-13" );
			
				resultset=ps.executeQuery();
				resultset.last();
				numberOfRows = resultset.getRow();
				System.out.print("numberOfRows :"+numberOfRows);
				System.out.print("resultset.getRow() :"+resultset.getRow());
			
				
				if(numberOfRows>0){
					resultset.beforeFirst();
				    rsmdResultSetMetaData = resultset.getMetaData();
					int numberOfColumns = rsmdResultSetMetaData.getColumnCount();
					
					System.out.print("rsmdResultSetMetaData :"+rsmdResultSetMetaData);
					System.out.print("resultset.getRow() :"+numberOfColumns);
				    listResult = new ArrayList<HashMap<String,Object>>();
				    
					while(resultset.next()){
						hmOutParam = new HashMap<String, Object>(3);
						for (int j = 1; j <= numberOfColumns; j++)
						{
							if(rsmdResultSetMetaData.getColumnTypeName(j).contains("message_time")){
								hmOutParam.put(rsmdResultSetMetaData.getColumnName(j), resultset.getTimestamp(rsmdResultSetMetaData.getColumnName(j)));
								
							}else{
								hmOutParam.put(rsmdResultSetMetaData.getColumnName(j), resultset.getString(rsmdResultSetMetaData.getColumnName(j)));
							}
						}
							listResult.add(hmOutParam);
					}
				}
				
			}
			catch(Exception e){
			e.printStackTrace();
			}
			return listResult;
			
	}

public static void main(String[] args) throws Exception {
	
	String ETLFlag = "";
	List<String> lstInParam = new ArrayList<String>();
	List<HashMap<String,Object>> lstOutputParam = null;
	lstOutputParam=fetchValues();
	System.out.println("lstOutputParam :"+lstOutputParam);
	if(lstOutputParam!=null && !lstOutputParam.isEmpty()){
		Iterator itroutputParam=lstOutputParam.iterator(); 
		while(itroutputParam.hasNext()){
		HashMap<String,Object> hmOutputParam = (HashMap<String,Object>)itroutputParam.next();
		System.out.println("hmOutputParam :"+hmOutputParam);
		ETLFlag = ETLFlag+(String)hmOutputParam.get("ETLFLAG");
		System.out.println("ETLFlag :"+ETLFlag);
		}
		ETLFlag=ETLFlag.trim();
		System.out.println("ETLFlag :"+ETLFlag);
}
}
}
