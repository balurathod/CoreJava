package com.rathod.oops;

import java.util.HashMap;
import java.util.List;


public class CreateHashMap {
	public static String id=null;
	public static String name=null;
	public static String amount=null;
	public static String date=null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static void main(String[] args) {
	DataExtractionBo bo=new DataExtractionBo();
	HashMap<String , Object>  hashMap=new HashMap<String, Object>();
	List<HashMap<String,Object>> lstOutputParam = null;
	
	hashMap=bo.getMap();
	System.out.println("hashMap :"+hashMap);
	bo.getMap().put("test", new Integer(12));
	System.out.println(" bo :"+bo);
	hashMap=bo.getMap();
	System.out.println(" hashMap ::::"+hashMap);
	/*lstOutputParam=bo.fetchData();
	
	hashMap=lstOutputParam.get(1);
	id=(String) hashMap.get(ServiceContext.ID);
	name=(String) hashMap.get(ServiceContext.NAME);
	amount=(String)hashMap.get(ServiceContext.AMOUNT);
	date=(String)hashMap.get(ServiceContext.LDATE);
	//System.out.println("lstOutputParam  :"+lstOutputParam);
	System.out.println("id  :"+id);
	System.out.println("name  :"+name);
	System.out.println("amount  :"+amount);
	System.out.println("date  :"+date);*/
	
}
}
