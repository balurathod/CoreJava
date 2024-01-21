package com.rathod.JavaFeaturesVersionwise.java8;

public interface InterfaceWithDefaultStaticMtd {

   default void print(){
      System.out.println("I am a vehicle!");
   }
   static void blowHorn(){
      System.out.println("Blowing horn!!!");
   }
}
