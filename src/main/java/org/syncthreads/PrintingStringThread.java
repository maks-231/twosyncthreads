package org.syncthreads;

public class PrintingStringThread extends Thread {
  private String str;
  private PrintingString printingString;
  Integer timesToRepeat;

  public PrintingStringThread(Integer timesToRepeat, String str, PrintingString printingString) {
    this.timesToRepeat = timesToRepeat;
    this.str = str;
    this.printingString = printingString;
  }

  @Override
  public void run() {
    printingString.printString(str, timesToRepeat);
  }
}
