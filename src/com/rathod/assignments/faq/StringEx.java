package com.rathod.assignments.faq;
//iNautix asked
public class StringEx {
	
	public void print(String s) {
		s = "abc";
	}
	
	public static void main(String[] args) {
		String s = "xyz";
		StringEx se = new StringEx();
		
		se.print(s);
		System.out.println(s);
		
		String str="BLUEJ";
		StringBuffer sb;
		StringBuffer sb2;
		char [] c = str.toCharArray();
		for(int i=1; i<=c.length; i++){
			sb=new StringBuffer();
			sb2=new StringBuffer();
			for(int j=1; j<=i; j++){
				sb.append(c[i-1]);
				sb2.append(c[j-1]);
			}
			sb.append(".").append(sb2);
			System.out.println(sb.toString());
		}
	}
}
