package com.rathod.oops;

class MWC114 {
  public static void main(String[] s) {
    String s1 = new String("ABCDEFG"),
		   s2 = new String("EFGHIJ");
         
	String s3 = s1.substring(4,7), 
		   s4 = s2.substring(0,3);

    //       s3=s4; //then they r =.
    
	System.out.println((s3 == s4) + "," + (s3 + s4).equals(s4 + s3));
  }
}

//how to copml & run?

//"=="- compare ref (s3, s4) r equal or not.
//( ref r never euqal before declare it as =)



//"equals()"-compare val r equal or not.