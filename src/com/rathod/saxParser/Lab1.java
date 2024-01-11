package com.rathod.saxParser;

import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class Lab1 {
	
	public static void main(String[] args) {
		try{
		XMLReader reader=XMLReaderFactory.createXMLReader("org.apache.xerces.parsers.SAXParser");
		TestHandler handler=new TestHandler();
		reader.setContentHandler(handler);
		reader.parse("src/test.xml");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
