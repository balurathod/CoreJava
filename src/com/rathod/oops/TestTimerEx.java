package com.rathod.oops;

public class TestTimerEx {
	private static int count = 0;
	private static int intTimers = 3;
	private static String strPerTimer 			= null;
	private static String strResTimer 			= null;
	private static String strIntraFXRates		= null;
	long timerInterval = -1;
	static String timerValue = null;
	static String tempValue = null;
public static void main(String[] args) {
	tempValue="300";
	timerValue = ""+(Integer.parseInt(tempValue)*60);
	System.out.println("timerValue :"+timerValue);
	Long	timer = Long.valueOf(timerValue);
	System.out.println("timer :"+timer);
}
}
