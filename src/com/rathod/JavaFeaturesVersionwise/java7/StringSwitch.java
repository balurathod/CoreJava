package com.rathod.java7;

public class StringSwitch {
	
	public void testStringSwitch(String param)
	{
		final String JAVA5 = "Java 5";
		final String JAVA6 = "Java 6";
		final String JAVA7 = "Java 7";
		
		if(param.equals(JAVA5))
		{
			System.out.println(JAVA5);
		}
		else if(param.equals(JAVA6))
		{
			System.out.println(JAVA6);
		}
		else if(param.equals(JAVA7))
		{
			System.out.println(JAVA7);
		}
		
		switch(param){
		case JAVA5: 
			System.out.println(JAVA5);break;
		case JAVA6: 
			System.out.println(JAVA6);break;
		case JAVA7: 
			System.out.println(JAVA7);break;
		}
	}
}
