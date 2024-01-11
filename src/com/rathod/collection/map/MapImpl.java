package com.rathod.collection.map;
import java.util.*;

import com.rathod.collection.BankAccount;
public class MapImpl {

	public static void main(String[] args) {
		Map<String, BankAccount> tm = new TreeMap<String, BankAccount>();
		  tm.put("M", new BankAccount("Michel", 111.11));
		  tm.put("G", new BankAccount("Georgie", 222.22));
		  tm.put("S", new BankAccount("Sam", 333.33));
		  tm.put("P", new BankAccount("Pei", 444.44));
		  tm.put("Z", new BankAccount("Zac", 555.55));
		 
		  Iterator<String> country = tm.keySet().iterator();
		  while(country.hasNext()){
			  System.out.println("key ="+tm.toString()+" n hashcode "+tm.get(country.next()));
		  }
		
	}
}
