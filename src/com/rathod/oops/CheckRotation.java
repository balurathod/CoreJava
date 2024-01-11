package com.rathod.oops;

class Rrotation{
	public static boolean IsRotation(String a, String b)
	{
	    System.out.println("\nA: {0} B: {1}  :"+ a + "  " + b);

	    if (b.length() != a.length())
	        return false;

	  //  int ndx = a.IndexOf(b[0]);
	    int ndx = a.indexOf(b, 0);
	    boolean isRotation = true;
	    System.out.println("Ndx: {0}   "+ ndx);
	    if (ndx == -1) return false;
	    for (int i = 0; i < b.length(); ++i)
	    {
	        int rotatedNdx = (i + ndx) % b.length();
	       // char rotatedA = a[rotatedNdx];

	    //    System.out.println("B: {0} A[{1}]: {2} :" + b[i]+ " : "+ rotatedNdx+ ": "+ rotatedA );

	      //  if (b[i] != rotatedA)
	        {
	            isRotation = false;
	            // break; uncomment this when you remove the Console.WriteLine
	        }
	    }
	    return isRotation;
	}
}
public class CheckRotation {
public static void main(String[] args) {
	Rrotation.IsRotation("stackoverflow", "ztackoverflow");
}
}
