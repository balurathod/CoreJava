package com.rathod.oops;
class For4 
{
	static String doStuff() //it is called place
	{
		for (int x = 0 ; x < 3 ; x++ )
		{
			System.out.println("In FOR loop...");
            //return "";
//return true; //goto at calling place (generally doStuff()
//return "My Logic";  just break "For "loop only & ln 14 r contue for compl & run 

		}

		System.out.println("My Creation");

       return "My Idea ";
//goto at calling place (generally main()) Err-micng return st.for return type what?

	}
	public static void main(String arf[]){ 
		For4 f = new For4(); 
//while there is no use of "f"(ref var) but creation of obj is necessary.
//Bcz static BLOCK&Initial blocks/Methods r executes at d time of creation of obj only   
	    String c =doStuff();
//		String c =return;   illegal
		}

}
//what vl happen?
//above all happens. nothing else

//returning type & metds declrcn type should & must b same always.