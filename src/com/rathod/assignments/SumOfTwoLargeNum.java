package com.rathod.assignments;

import java.math.BigInteger;

public class SumOfTwoLargeNum {

    public static String sumOfTwoLargeNum(String str, String str1) {

        if(str.length() > str1.length()) {
            String temp = str;
            str = str1;
            str1 = temp;
        }

        String result = "";
        
        int strLength = str.length();
        int str1Length = str1.length();

        str = new StringBuilder(str).reverse().toString();
        str1 = new StringBuilder(str1).reverse().toString();

        int carry = 0;
        for(int i = 0; i< strLength; i++) {
            int sum = ((int) (str.charAt(i) - '0') + (int) (str1.charAt(i) - '0') + carry);
            result += (char)(sum%10 + '0');
            carry = sum/10;
        }

        for(int i = strLength; i< str1Length; i++) {
            int sum = ((int) (str1.charAt(i) - '0') + carry);
            result += (char)(sum%10 + '0');
            carry = sum/10;
        }

        if( carry > 0 ) {
            result += (char)(carry + '0');
        }
        
        result = new StringBuilder(result).reverse().toString();

        return result;
    }
    public static void main(String[] args) {
        String str = "123";
        String str1 = "12300";
        System.out.println(sumOfTwoLargeNum(str, str1));


        BigInteger a = new BigInteger(str);
        BigInteger b = new BigInteger(str1);

        System.out.println("Sum of two large Number using BigInteger " +  a.add(b));

        String input1 = "012345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4554324324362432"
        + "7674637264783264"
        + "7832678463726478"
        + "3264736274673864"
        + "7364732463546354"
        + "6354632564532645"
        + "6325463546536453"
        + "6546325463546534"
        + "6325465345326456"
        + "4635463263453264"
        + "654632498739473"; 
String input2 = "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345678901234567"
        + "8901234567890123"
        + "4567890123456789"
        + "0123456789012345"
        + "6789012345678901"
        + "2345873271893718"
        + "2974897146378481"
        + "7489127847281478"
        + "2174871248721847"
        + "8748327463756475"
        + "6745781641263981"
        + "2839721897438974"
        + "3286574365764576"
        + "2376914689217817"
        + "4362473624721647"
        + "61247612748612746";


        a = new BigInteger(input1);
        b = new BigInteger(input2);

        System.out.println("Sum of two very large Number using BigInteger " +  a.add(b));


    }
}
