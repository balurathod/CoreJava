package com.rathod.unsolved;

public class TryEx {

	public static Object m1(Object args) {
		System.out.println("Obj" + args);
		return args;
	}

	public static String m1(String args) {
		System.out.println(args);
		return args;
	}

	public static void main(String[] args) {
		m1(null);
	}

	public static boolean tryMtd(String[] args) {
		// TODO Auto-generated method stub
		try {
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			return false;
		}

	}

}
