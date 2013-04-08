package com.javaeasy.waitnotify;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 17:33
 */
public class Notifier implements Runnable {
    private Object notifyObj;

    public Notifier(Object notifyObj) {
        this.notifyObj = notifyObj;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + "线程将挂起5秒");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(threadName + "开始notify线程");
        synchronized (notifyObj) {
            notifyObj.notify();
        }
        System.out.println(threadName + "notify线程结束");
    }
}
