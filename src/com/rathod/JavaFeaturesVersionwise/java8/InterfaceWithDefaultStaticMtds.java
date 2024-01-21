package com.rathod.JavaFeaturesVersionwise.java8;

public interface InterfaceWithDefaultStaticMtds {

   default void print(){
      System.out.println("I am a vehicles.....!");
   }
   static void blowHorn(){
      System.out.println("Blowing horn....!!!");
   }
}

