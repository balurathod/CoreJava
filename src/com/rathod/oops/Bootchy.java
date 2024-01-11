package com.rathod.oops;
//51. Click the Exhibit button.
 public class Bootchy {
     int bootch;
     String snootch;

      public Bootchy() {
                         this("snootchy");
                         System.out.print("first ");
                       }

     public Bootchy(String snootch) {
                                      this(420, "snootchy");
                                      System.out.print("second ");
                                    }

     public Bootchy(int bootch, String snootch) {
                                                    this.bootch = bootch;
                                                    this.snootch = snootch;
                                                    System.out.print("third ");
                                                 }   
     public static void main(String[] args) {
                                             Bootchy b = new Bootchy();
                                             System.out.print(b.snootch + " " + b.bootch);
                                           }
 }
 /*
What is the result?
A. snootchy 420 third second first
B. snootchy 420 first second third
C. first second third snootchy 420
D. third second first snootchy 420
E. third first second snootchy 420
F. first second first third snootchy 420
Answer: D

How?*/