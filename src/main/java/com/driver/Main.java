package com.driver;

public class Main {
  public static void main(String a[])
  {
      RWOnly r1 = new RWOnly();
     // r1.name="Akash"; //name has private access in com.driver.RWOnly
      r1.setName("Akash");
      System.out.println(r1.getName());
  }
}