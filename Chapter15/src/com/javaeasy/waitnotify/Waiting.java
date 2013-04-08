package com.javaeasy.waitnotify;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:28
 */
public class Waiting implements Runnable {
    private Object waitObj;

    public Waiting(Object waitObj) {
        this.waitObj = waitObj;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "：线程将进入挂起状态，等待被别的线程唤醒...");
        try {
            synchronized (waitObj) {
                waitObj.wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(threadName + "线程被唤醒了");
    }
}
