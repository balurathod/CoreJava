package com.rathod.oops;

import java.util.ResourceBundle;

public class ServiceContext {
	public static ResourceBundle resBundle;
	static {
		try {			
			resBundle = ResourceBundle.getBundle("serviceconted");// parasoft-suppress SECURITY.WSC.APIBS "trusted code"
		} catch (Exception e) {
		}
	}
	

	public static String BEM_RESP_CODE_ACCOUNT_DETAILS_SUCESS = resBundle.getString("BEM_RESP_CODE_ACCOUNT_DETAILS_SUCESS");
	public static String BEM_RESP_CODE_555555 = resBundle.getString("BEM_RESP_CODE_555555");
	public static String BEM_RESP_CODE_631000 = resBundle.getString("BEM_RESP_CODE_631000");
}
