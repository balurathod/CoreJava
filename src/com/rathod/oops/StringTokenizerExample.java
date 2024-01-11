package com.rathod.oops;

import java.util.StringTokenizer;

public class StringTokenizerExample {
public static void main(String[] args) {
	String line="This eaarth: has now become hell: where people does not have: respect to each other";
	StringTokenizer stringTokenizer=new StringTokenizer(line,":");
	
	while(stringTokenizer.hasMoreTokens()){
	String var=(String) stringTokenizer.nextElement();
	System.out.println("var : " +var);
	
}
	
}
}
