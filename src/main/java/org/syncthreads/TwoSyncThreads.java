package org.syncthreads;


public class TwoSyncThreads {
    public static void main( String[] args ) {
        PrintingString printingString = new PrintingString();

        PrintingStringThread thread1 = new PrintingStringThread(10, "Hello world from thread 1!", printingString);
        PrintingStringThread thread2 = new PrintingStringThread(8, "Hello world from thread 2!", printingString);

        thread2.start();
        thread1.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
