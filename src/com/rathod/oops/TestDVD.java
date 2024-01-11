package com.rathod.oops;
import java.util.*;
import java.io.*;

class TestDVD
{
   ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
   public static void main(String[] args) 
   	{
		new TestDVD().go();
	}
	public static void go()
	{
		populateList();

		System.out.println(dvdList);
		Collection.sort(dvdList); 
		System.out.println(dvdList);

		GenreSort gs =new GenreSort();
		Collctions.sort(dvdList,gs);
		System.out.println(dvdList);
	}


    public void populateList()
	{
     //  
	}

}


