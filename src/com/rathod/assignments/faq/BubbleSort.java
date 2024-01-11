package com.rathod.assignments.faq;

public class BubbleSort {
	 
	public static void main(String[] args) {  
	 
		int a[]={23,5,6,66,1};	 
		int n=a.length;	 
		int temp=0;
		 
		for(int i=0;i<n;i++){	 
			for(int j=1;j<(n-i);j++){
			 
			if(a[j-1]>a[j]){
			   temp=a[j];
			  a[j]=a[j-1];
			  a[j-1]=temp;
			 
			  }    		 
			}	 
		}	 
		for(int k=0;k<n;k++){
			System.out.println(a[k]);
		} 
	} 
}
