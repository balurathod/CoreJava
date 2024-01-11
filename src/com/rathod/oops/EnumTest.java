package com.rathod.oops;


enum Test1{
	Morning(9,12),Evening(5,7);
	int startTime;
	int endTime;
	Test1(int startTime, int endTime){
		this.startTime=startTime;
		this.endTime=endTime;
	}
}
public class EnumTest {
public static void main(String[] args) {
	System.out.println(Test1.Morning.startTime);
	System.out.println(Test1.Morning.endTime);
	System.out.println(Test1.Evening.startTime);
}
}
