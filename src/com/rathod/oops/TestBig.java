package com.rathod.oops;

import java.math.BigDecimal;
import java.util.HashMap;

public class TestBig {
public static void main(String[] args) {
	String strDrAmount=null;
	HashMap map=new HashMap();
	map.put("bdDbAmount","999999999.99999" );
	System.out.println(map);
	Object bdDbAmount1=map.get("bdDbAmount");
	System.out.println("bdDbAmount    "+bdDbAmount1);
	
	BigDecimal bdAmount = (BigDecimal)bdDbAmount1;
	System.out.println("bdAmount "+bdAmount);
	strDrAmount = bdAmount.toString();
	System.out.println("strDrAmount   "+strDrAmount);
}
}
