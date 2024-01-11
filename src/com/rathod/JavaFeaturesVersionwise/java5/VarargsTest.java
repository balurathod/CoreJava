package com.rathod.java5;
//The Varargs java 5.0 feature avoids the need to group up arguments into an array in order to pass while invoking a method.
public class VarargsTest 
{
    public static void main(String[] args) 
    {
        System.out.println(" Sum = " + sum(41, 22, 58));
        System.out.println(" Sum1 = " + sum(98, 33, 105, 10, 7));						//=>  Sum = 253
        System.out.println(" Sum2 = " + sum(208, 27, 89, 320, 42, 154, 111, 65, 93));	//=>  Sum = 1109
    }

    static int sum(int... numbers) {	// varargs
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
/*
Output: Sum = 121
Varargs can also be combined with other arguments, but there should be only one vararg for a method and that vararg should be the last argument for that method.
eg - double calculator(String operation, double... numbers)
     void print(long productId, double price, int qty, String... orderDetails)
*
*/