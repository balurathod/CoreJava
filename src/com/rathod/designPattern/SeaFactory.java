package com.rathod.designPattern;

public class SeaFactory implements AnimalFactory {
 
  public Animal createAnimal() {
    return new Shark();
  }
 
}