package com.rathod.oops;

import java.util.Date;

public class TestServiceContext {
public static void main(String[] args) {
	String accountsucces="AAAAAA";
	String accountparse="555555";
	String accountfail="555555";
	
	
	if(ServiceContext.BEM_RESP_CODE_ACCOUNT_DETAILS_SUCESS.equalsIgnoreCase(accountsucces)){
		System.out.println("pass");
	}
	
	
	if(ServiceContext.BEM_RESP_CODE_ACCOUNT_DETAILS_SUCESS.equals(accountsucces)){
		System.out.println("passVVVVVV");
	}
}
}
