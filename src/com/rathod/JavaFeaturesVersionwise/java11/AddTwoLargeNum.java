package com.rathod.JavaFeaturesVersionwise.java11;
// Use this editor to write, compile and run your Java code online

import java.math.BigInteger;

class AddTwoLargeNum {
    // Function for finding sum of larger numbers
    static String findSumOfTwoLargeNumWithutBigInteger(String str1, String str2) {
        // Before proceeding further, make sure length of str2 is larger.
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // Take an empty String for storing result
        String result = "";

        // Calculate length of both String
        int str1Length = str1.length(), str2Length = str2.length();

        // Reverse both of Strings
        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < str1Length; i++) {
            // Do school mathematics, compute sum of current digits and carry
            int sum = ((int) (str1.charAt(i) - '0') +
                    (int) (str2.charAt(i) - '0') + carry);
            result += (char) (sum % 10 + '0');
            // Calculate carry for next step
            carry = sum / 10;
        }

        // Add remaining digits of larger number
        for (int i = str1Length; i < str2Length; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + carry);
            result += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        // Add remaining carry
        if (carry > 0)
            result += (char) (carry + '0');
        // reverse resultant String
        result = new StringBuilder(result).reverse().toString();

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";
        System.out.println(findSumOfTwoLargeNumWithutBigInteger("Without Using BigInteger "+str1, str2));

        //another way
        BigInteger a = new BigInteger(str1);
        BigInteger b = new BigInteger(str2);
        System.out.println("using BigInteger "+a.add(b));
    }
}
