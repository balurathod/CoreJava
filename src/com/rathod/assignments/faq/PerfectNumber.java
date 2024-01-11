//WAP to chk wheather given no. is perfect or not.
package com.rathod.assignments.faq;

public class PerfectNumber {

	public static void main(String[] args) {
		int perfNum = 16;
		int divisor =0;
		int rem = perfNum%2;
		int prfNo = 0;
		//System.out.println("rem "+rem);
		if(rem == 0){		
			for (int j = 1; j < 5; j++) {
				divisor = perfNum/j ;
				System.out.println("divisor "+divisor);
				if(perfNum != divisor)
				prfNo = prfNo + divisor;
			}	System.out.println("Given no. is perfect " +prfNo);
		}
		
//		
//		//int i = 0;
//		int perfect = 0;
//		for (int j = 1; j < 5; j++) {
//			divisor = perfNum/j ;
//			System.out.println("divisor "+divisor);
//			if( divisor%2 == 0){
//				perfect = perfect+divisor;
//			}
//						
//		}	System.out.println("Given no. is perfect " +perfect);	
	}

}
