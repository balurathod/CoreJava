package com.rathod.unsolved;
//82. Given a method that must ensure that its parameter is not null:
 public void someMethod(Object value) {
 // check for null value
 System.out.println(value.getClass());
 }

 /*
What, inserted at line 3, is the appropriate way to handle a null value?
A. assert value == null;
B. assert value != null, "value is null";
C. if (value == null) {
throw new AssertionException("value is null");
}
D. if (value == null) {
throw new IllegalArgumentException("value is null");
}
Answer: D

*/