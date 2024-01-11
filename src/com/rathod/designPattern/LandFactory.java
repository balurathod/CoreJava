package com.rathod.designPattern;

public class LandFactory implements AnimalFactory {
  public Animal createAnimal() {
    return new Elephant();
  }
}