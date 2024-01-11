package com.rathod.oops;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

import com.polaris.cache.JDBCUtil;

public class DataExtractionBo {
HashMap< String, Object> map=new HashMap<String, Object>();
public int id=0;
public String name=null;
public Long amount=null;
public Date ldate=null;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getAmount() {
	return amount;
}

public void setAmount(Long amount) {
	this.amount = amount;
}

public Date getLdate() {
	return ldate;
}

public void setLdate(Date ldate) {
	this.ldate = ldate;
}


public List<HashMap<String, Object>> fetchData(){
	System.out.println("inside fetchData");
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pst=null;
	ResultSetMetaData rsmdResultSetMetaData=null;
	List<HashMap<String,Object>> lstOutputParam = new ArrayList<HashMap<String,Object>>();
	HashMap<String,Object> hmOutputParam = null;
	try{
	con=JDBCUtil.getConnection();
	pst=con.prepareStatement(QueryConstant.FETCH_DATA);
	rs=pst.executeQuery();
	rsmdResultSetMetaData=rs.getMetaData();
	//System.out.println("rsmdResultSetMetaData  :"+rsmdResultSetMetaData);
	int numberOfColumns = rsmdResultSetMetaData.getColumnCount();
	while(rs.next()){
	hmOutputParam=new HashMap<String, Object>();
	int numberOfRows = 0;
	numberOfRows=rs.getRow();
	if(numberOfRows>0){
		System.out.println("number of column is greater than zero");
		for(int i=1;i<=numberOfColumns;i++){
			hmOutputParam.put(rsmdResultSetMetaData.getColumnName(i), rs.getString(rsmdResultSetMetaData.getColumnName(i)));
		System.out.println("hmOutputParam     "+hmOutputParam);
		}
		
		lstOutputParam.add(hmOutputParam);
		System.out.println("return value is "+lstOutputParam);
	}
	
	
}

	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	return lstOutputParam;
}
public HashMap<String, Object> getMap() {
	map.put("id",new Integer(10));
	map.put("amount",new Integer(1000));
	map.put("date", new Date());
	map.put("name", new String("shyama"));
	return map;
}

public void setMap(HashMap<String, Object> map) {
	this.map = map;
}



}
