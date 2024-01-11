package com.rathod.oops;
import java.lang.reflect.Field;
import java.util.*;
public class ReflectionTest {
	public static void main(String[] args) throws SecurityException, NoSuchFieldException {
		ReflectionTest f = new ReflectionTest(); //Make an object of your class
		Field a = f.getClass().getDeclaredField("EmpId");    //get private declared object from class
        a.setAccessible(true);  //Make it accessible so you can access it
        try {
			ArrayList al = (ArrayList) a.get(f);
			System.out.println("Hello, world!"+al);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    // At last it's yours.
	}

}
//chk still not understnd how to access private member