package com.javaeasy.usethread;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 17:30
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println("这是在另一个线程中执行的代码。");
    }
}
