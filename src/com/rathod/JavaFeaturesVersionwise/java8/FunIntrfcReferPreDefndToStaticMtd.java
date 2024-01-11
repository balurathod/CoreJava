package com.rathod.java8;
//In the following example, we are using predefined functional interface Runnable to refer static method.

public class FunIntrfcReferPreDefndToStaticMtd {
    public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) {  
        Thread t2=new Thread(FunIntrfcReferPreDefndToStaticMtd::ThreadStatus);  
        t2.start();       
    }  
}  