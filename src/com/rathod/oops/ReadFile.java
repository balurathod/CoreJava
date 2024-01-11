package com.rathod.oops;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ReadFile {
 
	public static void main(String[] args) {
 
	BufferedReader br = null;
 
	try {
 
		String line;
 
		br = new BufferedReader(new FileReader("C://Users//shyama.sharma//Desktop//table_export.csv"));
 
		while ((line = br.readLine()) != null) {
		   System.out.println(line);
 
	  StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
 
		   while (stringTokenizer.hasMoreElements()) {
 
			String id = stringTokenizer.nextElement().toString();
		    String price = stringTokenizer.nextElement().toString();
		    String username = stringTokenizer.nextElement().toString();
 
			StringBuilder sb = new StringBuilder();
			sb.append("\nId : " + id);
			sb.append("\nPrice : " + price);
			sb.append("\nUsername : " + username);
			
			sb.append("\n*******************\n");
 
			System.out.println(sb.toString());
		   }
		}
 
		System.out.println("Done");
 
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (br != null)
				br.close();
 
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
 
	}
}