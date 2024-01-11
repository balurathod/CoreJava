package com.rathod.assignments;

public class GetdistingctCharCount {
    public static void main(String[] args) {
        //get distinct char and their count.

        String str = "abcdABCDabcd";  // o/p a = 3 times n count of 
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            int flag = 0;
            for (int j = 0; j < str.length(); j++)
            {
                // checking if two characters are equal
                if (str.charAt(i) == str.charAt(j) && i != j) 
                {                    
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                flag++;
                System.out.print(str.charAt(i));
                System.out.println(flag);
        }
    }
}
