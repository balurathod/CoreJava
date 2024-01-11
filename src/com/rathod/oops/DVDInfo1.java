package com.rathod.oops;
class DVDInfo1 implements Comparable<DVDInfo>  
{
	String title;
	String genre;
	String leadActor;
	
	DVDInfo1(String t , String g , String a)
	{
       title = t;
	   genre = g;
	   leadActor = a ;
	}
    public String toString()
	{
		return title + " " + genre + " " + leadActor + "\n"; 
	}
	public int compareTo(DVDInfo d)
	{
		return title.compareTo(d.getTitle());
	}
	public String getTitle()
	{
		return title;
	}
	//getr & str () here..

	ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();
	void populateList();          //adds d files data to arrayList.
	
	System.out.println(dvdList);
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
