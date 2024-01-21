package com.rathod.JavaFeaturesVersionwise.java10;

class AddLargeStringNum {
    
    static String findSumOfTwoLargeNum(String str1, String str2) {
        

        int str1Len = str1.length();
        int str2Len = str2.length();

        if(str1.length() > str2.length()) {
            String temp = str1;
            str2 = str1;
            str1 = temp;
        }

        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        String result = ""; 
        int carry = 0;

        for(int i = 0 ; i < str1Len; i++) {

            int sum  = ((int) (str1.charAt(i) - '0') + (str2.charAt(i) - '0') + carry);
             result += (char) (sum % 10 + '0');             
             carry = sum / 10;
        }

        for(int i= str1Len; i < str2Len; i++) {

            int sum = ((int) (str2.charAt(i) - '0') + carry);
            result += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if( carry > 0 ) {
            result = new StringBuilder(result).reverse().toString();
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        String str1 = "1234556";
        String str2 = "11112223334445556666";
        System.out.println(findSumOfTwoLargeNum(str1, str2));
    }
}