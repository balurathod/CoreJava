/**
 * 
 */
package com.rathod.oops;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;;

/**
 * @author vitthal
 *
 */

class Persons {
	
	private int id;
	private String name;
	
	
	public Persons(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id +" : "+name;
	}
	
}
class StringLengthCmprtr implements Comparator<String>{

	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
			
		} else if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

class AlphabeticalOrder implements Comparator<String> {//customize sorting

	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2);
	}
	
}

class ReverseAlphabeticalOrder implements Comparator<String> {//customize sorting

	public int compare(String s1, String s2) {
		
		return -s1.compareTo(s2);
	}
	
}


public class CmprtrCmprblEX {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		
		lst.add("Tiger");
		lst.add("Cat");
		lst.add("Donkey");
		lst.add("Monkey");
		lst.add("Lion");
		
		Collections.sort(lst, new AlphabeticalOrder());
		
		for (String animals : lst) {
			System.out.println(animals);
		}
		
		List<Integer> lstNum = new ArrayList<Integer>();
		
		lstNum.add(21);
		lstNum.add(343);
		lstNum.add(45);
		lstNum.add(455);
		lstNum.add(56);
		
		Collections.sort(lstNum, new Comparator<Integer>(){//Anonymous class 

			public int compare(Integer num1, Integer num2) {
				return -num1.compareTo(num2);
			}
			
		});
		for (Integer numbers : lstNum) {
			System.out.println(numbers);
		}
		
		
		//////////////////////////////Sorting arbitrary object///////////////////////////////////
		List<Persons> lp = new ArrayList<Persons>();
		
		lp.add(new Persons(1, "Rathod"));
		lp.add(new Persons(3, "Vitthal"));
		lp.add(new Persons(4, "Sujata"));
		lp.add(new Persons(2, "Arun"));
		lp.add(new Persons(5, "Mahesh"));
		
//////////////////////Sort in order of id///////////////////////////////////
		Collections.sort(lp, new Comparator<Persons>() {

			public int compare(Persons p1, Persons p2) {

				if (p1.getId() > p2.getId()) {
					return 1;
					
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});		
		
		for (Persons persons : lp) {
			System.out.println(persons);
		}
		
		System.out.println("\n");
		//////////////////////Sort in order of name///////////////////////////////////
		Collections.sort(lp, new Comparator<Persons>() {

			public int compare(Persons p1, Persons p2) {
				
				return p1.getName().compareTo(p2.getName());
			}
			
		});		
		
		for (Persons persons : lp) {
			System.out.println(persons);
		}

	}

}
