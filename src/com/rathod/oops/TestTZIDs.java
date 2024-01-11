package com.rathod.oops;
import java.util.*;

public class TestTZIDs {
  public static void main(String args[]) {
    String[] ids = TimeZone.getAvailableIDs();

    for (int i = 0; i < ids.length; ++i) {
      System.out.println(ids[i]);
    } 
  } 
}
