package com.rathod.oops;

public class FibonacciExample1{  
	public static void main(String args[])  
	{    
		 int n1=0,n2=1,n3,i,count=10;    
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }  
		 System.out.println("  Logic 1 End ");   
		 
		//way 2
		 int febCount = 10;
         int[] feb = new int[febCount];
         feb[0] = 0;
         feb[1] = 1;
         for(int j=2; j < febCount; j++){
             feb[j] = feb[j-1] + feb[j-2];
         } 
         for(int j=0; j< febCount; j++){
                 System.out.print(feb[j] + " ");
         }
         System.out.println(" Logic 2 End ");
         
         //way 3
         int prev, next, sum, n;
         prev=0;next=1;
         for(n=1;n<=10;n++)
         {
	         System.out.print(prev+" ");
	         sum=prev+next;
	         prev=next;
	         next=sum;
         }
         System.out.println(" Logic 3 End ");
         
         //way 4
         int a = 0;
         int b = 1;
         for (int k = 0;k<10;k++){
	         System.out.print(a+" ");	
	         a = a+b;	
	         b = a-b;
         }  
         System.out.println(" Logic 4 End ");
//         int counts=10;    
//         System.out.print(" "+n1+" "+n2);//printing 0 and 1    
//         printFibonacci(count-2);//n-2 because 2 numbers are already printed  
   	}
	
	//way 5
//	static int n1=0,n2=1,n3=0;  
//	static void printFibonacci(int counts){    
//	    if(counts>0){    
//	         n3 = n1 + n2;    
//	         n1 = n2;    
//	         n2 = n3;    
//	         System.out.print(" "+n3);   
//	         printFibonacci(counts-1);    
//	     }    
//	 }    
}