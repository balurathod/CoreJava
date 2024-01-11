package com.rathod.oops;

import java.util.Locale;

public class LocalesExample {
public static void main(String[] args) {
	System.out.println(Locale.getDefault());

/*	Locale locale[]=Locale.getAvailableLocales();
	int len=locale.length;
	System.out.println("length ::"+len);
	for(int i=0;i<locale.length;i++){
		System.out.println("locale values ::::"+locale[i].toString());
	}*/
	
	/*String countries[]=Locale.getISOCountries();
	int len1=countries.length;
	System.out.println("length ::"+len1);
	for(int i=0;i<countries.length;i++){
		System.out.println("locale values ::::"+countries[i].toString());
	}*/
	
	String languages[]=Locale.getISOLanguages();
	int len2=languages.length;
	System.out.println("length ::"+len2);
	for(int i=0;i<languages.length;i++){
		System.out.println("locale values ::::"+languages[i].toString());
	}
}
}
