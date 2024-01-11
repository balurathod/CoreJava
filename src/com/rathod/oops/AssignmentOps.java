package com.rathod.oops;
// u can even nest conditional operators into one statements.....
class AssignmentOps 
{
	public static void main(String[] args) 
	{
		int sizeOfYard=10;
		int numOfPets=3;
		String status=(numOfPets<4) ? "Pet count ok."
		                            : (sizeOfYard>8)
									? "pet limit on the edge"
									: "Too many pets";

		System.out.println("Pet status is :- " + status);
	}
}
/*

G:\SCJP\Query\LOGIC>javac AssignmentOps.java

G:\SCJP\Query\LOGIC>java AssignmentOps
Pet status is :- Pet count ok.

G:\SCJP\Query\LOGIC>javac AssignmentOps.java

G:\SCJP\Query\LOGIC>java AssignmentOps
Pet status is :- pet limit on the edge

G:\SCJP\Query\LOGIC>javac AssignmentOps.java

G:\SCJP\Query\LOGIC>java AssignmentOps
Pet status is :- Too many pets

G:\SCJP\Query\LOGIC>
*/