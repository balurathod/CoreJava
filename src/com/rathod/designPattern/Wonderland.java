package com.rathod.designPattern;
public class Wonderland {
  public Wonderland(AnimalFactory factory) {
    Animal animal = factory.createAnimal();
    animal.breathe();
  }
}