package com.javaeasy.exercises;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:49
 */
public class MyWriter extends Thread {
    private ConsoleWriter consoleWriter;


    public MyWriter(ConsoleWriter consoleWriter) {
        this.consoleWriter = consoleWriter;
    }

    @Override
    public void run() {
        if (consoleWriter != null) {
            consoleWriter.writeToConsole("MyWriter");
        }
    }
}
