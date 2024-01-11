package com.rathod.oops;

public class StaticEx {

	private String Fname;
	private String Lname;
	private static int members = 0;
	
	public StaticEx(String fname, String lname) {
		Fname = fname;
		Lname = lname;
		members++;
		System.out.printf("Constructor for %s %s members in the club : %d\n", Fname, Lname, members);
	}

//second part for static
	public String getFname() {
		return Fname;
	}

	public String getLname() {
		return Lname;
	}

	public static int getMembers() {
		return members;
	}


	public static void main(String[] args) {
		StaticEx se = new StaticEx("Balu", "Rathod");
		StaticEx se1 = new StaticEx("Vitthal","Rathod");
		StaticEx se2 = new StaticEx("Sujata","Rathod");
		
		//second part for static
		System.out.println("++++++++++Second part for static========");
		System.out.println(se.Fname);
		System.out.println(se.Lname);
		System.out.println(se.members);
		
		System.out.println(se1.Fname);
		System.out.println(se1.Lname);
		System.out.println(se1.members);
		
		
		System.out.println(StaticEx.getMembers());
	}

}
