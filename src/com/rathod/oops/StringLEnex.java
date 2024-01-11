package com.rathod.oops;

import java.io.ObjectInputStream.GetField;

public class StringLEnex {
	String getAdvice(){
		
		String[] advice={"that colors not working for you","you should call in sick","you might want to rethink that haircut"};
		int random=(int)(Math.random()* advice.length);
			return advice[random];
		
	}
	
	public void stringReverse(String name){
		char ch1[]=name.toCharArray();
		/*for(int i=ch1.length-1;i>=0;i--){
			System.out.print(ch1[i]);
		}*/
		int len=ch1.length;
		for(int i=len-1;i>=0;i--){
			System.out.print(name.charAt(i));
		}
	}
public static void main(String[] args) {

	StringLEnex enex=new StringLEnex();
	String ar=enex.getAdvice();
	System.out.println(ar +": ");
	
	enex.stringReverse("shyama");
}
}
