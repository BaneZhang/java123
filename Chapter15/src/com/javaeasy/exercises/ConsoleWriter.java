package com.javaeasy.exercises;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:45
 */
public class ConsoleWriter {
    public synchronized void writeToConsole(String string) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + string);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
