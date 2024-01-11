package com.rathod.oops;
//Backed Collections.... 
import java.util.*;
public class BakedColl 
{
	public static void main(String[] args) 
	{
		TreeMap<String , String> map = new TreeMap<String , String>();
		map.put("a", "ant");
		map.put("d", "Dog");
		map.put("h", "horse");

		SortedMap<String , String> submap;     
		submap = map.subMap("b" , "g");        //1-cret a baked coll.
		System.out.println(map + " " + submap);//2-showcontnts
         
		map.put("b" , "bat");                  //3-add to originl
		submap.put("f" , "fish");              //4-add to copy
		map.put("r" , "reccon");               //5-add to orignl out of range
	//	submap.put("p" , "pig");               //6-add to copy out of range
		System.out.println(map + " " + submap);//7-swhow final contents
	}
}
