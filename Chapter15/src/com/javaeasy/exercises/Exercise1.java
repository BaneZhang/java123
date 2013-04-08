package com.javaeasy.exercises;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:43
 */
public class Exercise1 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
