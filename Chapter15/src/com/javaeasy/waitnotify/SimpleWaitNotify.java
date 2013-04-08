package com.javaeasy.waitnotify;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:37
 */
public class SimpleWaitNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        Waiting waiting = new Waiting(obj);
        Notifier notifier = new Notifier(obj);
        Thread waitingThread = new Thread(waiting, "挂起线程");
        Thread notifierThread = new Thread(notifier, "唤醒线程");
        waitingThread.start();
        notifierThread.start();
    }
}
