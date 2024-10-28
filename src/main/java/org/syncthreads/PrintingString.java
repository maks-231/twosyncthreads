package org.syncthreads;

public class PrintingString {
  public void printString(String str, Integer timesToRepeat) {
    synchronized (PrintingString.class) {
      while (timesToRepeat > 0) {
        System.out.println(str + ", count: " + timesToRepeat);
        timesToRepeat--;
      }
    }
  }
}
