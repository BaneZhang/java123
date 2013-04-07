package com.javaeasy.currentthread;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 18:27
 */
public class CurrentThreadMainII {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                PrintCurrentThreadName printCurrentThreadName = new PrintCurrentThreadName();
                printCurrentThreadName.printCurrentThreadName();
            }
        };
        Thread thread = new Thread(runnable, "线程-1");
        thread.start();
    }
}
