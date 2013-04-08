package com.javaeasy.multithreads;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 10:42
 */
public class PrintNumberThread extends Thread {
    private int times;

    public PrintNumberThread(int times) {
        this.times = times;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                this.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
                return;
            }
            System.out.println(this.getName() + "\t:\t" + i);
        }

        System.out.println("线程\"" + this.getName() + "\"结束了");
    }
}
