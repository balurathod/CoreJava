package com.rathod.saxParser;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestHandler extends DefaultHandler {
 public void startDocument() throws org.xml.sax.SAXException {
	// System.out.println("startDocument reading!!!!!!");
 }
 @Override
	public void endDocument() throws SAXException {
		//System.out.println("endDocument end...");
	}
 @Override
	public void startElement(String ns, String tn, String tm,
			Attributes attr) throws SAXException {
	 		Set<String> set= new HashSet<String>();
	 		set.add(tn);
	 //System.out.println(tn+"element is started");
	 Iterator iterator=set.iterator();
	 while(iterator.hasNext()){
		 String tagName=(String)iterator.next();
		 System.out.println("TagName  :  "+tagName); 
	 }
	 
	 int len=attr.getLength();
	 //System.out.println("No of Attribute for "+tn+" are "+len);
	 for(int i=0;i<len;i++){
		// System.out.println(attr.getLocalName(i)+ "\t" + attr.getValue(i));
		 
	 }
	}
 @Override
	public void endElement(String ns, String tn, String tm)
			throws SAXException {
	// System.out.println("endElement");
	}
 @Override
	public void characters(char[] ch, int start, int total) throws SAXException {
		String str=new String(ch,start,total);
		//System.out.println("ch "+ch +" start :"+start+ " total "+total);
	if(true){
			System.out.println("str :"+str);
		}
		else{
			System.out.println();
		}
 }
 
	}

