package com.rathod.oops;
import java.util.*;
import java.io.*;
class DVDInfo implements Comparable<DVDInfo>  
{
	String title;
	String genre;
	String leadActor;
	
	DVDInfo(String t , String g , String a)
	{
       title = t;
	   genre = g;
	   leadActor = a ;
	}
    public String toString()
	{
		return title + " " + genre + " " + leadActor + "\n"; 
	}
	//getr & str () here..

    public static void main(String[] args) 
	{	
	ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
	//void populateList();          //adds d files data to arrayList.
	Collections.sort(dvdList);
	System.out.println(dvdList);
	System.out.println("Hello World!");
	}
}
