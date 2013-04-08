package com.javaeasy.exercises;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:53
 */
public class Exercise2 {
    public static void main(String[] args) {
        ConsoleWriter consoleWriter = new ConsoleWriter();
        MyWriter myWriter1 = new MyWriter(consoleWriter);
        MyWriter myWriter2 = new MyWriter(consoleWriter);
        myWriter1.start();
        myWriter2.start();
    }
}
