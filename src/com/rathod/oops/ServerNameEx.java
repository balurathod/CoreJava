package com.rathod.oops;

import java.util.StringTokenizer;

public class ServerNameEx {
	private static String getServerName(String strNodeName) throws Exception {
		StringTokenizer stk = new StringTokenizer(strNodeName, "\\");
		String strServerName 				= null;
		int i = stk.countTokens();
		for(int j=0;j<i;j++) { 
			strServerName = stk.nextToken();
			System.out.println("strServerName :"+strServerName);
		}
		return strServerName;
	}
public static void main(String[] args) {
	try {
	String nodeName=	getServerName("PSLPER04Node10Cell\\PSLPER04Node10\\server1");
	System.out.println("nodeName :"+nodeName);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
