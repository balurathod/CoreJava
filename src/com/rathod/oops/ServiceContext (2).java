
package com.core.createHashmap;

import java.util.ResourceBundle;
import java.util.logging.Logger;

public class ServiceContext {
	
	private static ResourceBundle resbunLabels;	
	
	
	static {
		try {
			System.out.println("Loading Service Context Prop File.");		
			resbunLabels = ResourceBundle.getBundle("ServiceContext");
			System.out.println(resbunLabels);
			
			System.out.println("File Loaded : Service Context.");			
		} catch (Exception e) {
			System.out.println("Exception :"+e.getMessage());	
			
		}
	}
	public static String ID=resbunLabels.getString("SER_ID");
	public static String NAME=resbunLabels.getString("SER_NAME");
	public static String AMOUNT=resbunLabels.getString("SER_AMOUNT");
	public static String LDATE=resbunLabels.getString("SER_DATE");
	
}
	
	