package com.javaeasy.threadname;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 18:18
 */
public class ShowThreadName extends Thread {
    public ShowThreadName() {
        super();
    }

    public ShowThreadName(String name) {
        super(name);
    }

    public void run() {
        System.out.println("这个线程的名字是：" + this.getName());
    }
}
