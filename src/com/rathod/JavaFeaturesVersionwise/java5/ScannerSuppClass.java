package com.rathod.java5;

public class ScannerSuppClass {
	private String girlsName ;

	public String getGirlsName() {
		return girlsName;
	}

	public void setGirlsName(String girlsName) {
		this.girlsName = girlsName;
	}
	
	public void saying(){
		System.out.println("Your first girlfriend was "+ getGirlsName());
	}

}
