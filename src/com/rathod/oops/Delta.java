package com.rathod.oops;
interface Foo {}
 class Alpha implements Foo {}
 class Beta extends Alpha {}
 class Delta extends Beta {
 public static void main( String[] args ) {
 Beta x = new Beta();
 // insert code here
 //Which code, inserted at line 16, will cause a java.lang.ClassCastException?

 Foo f = (Delta)x;

 }
 }
