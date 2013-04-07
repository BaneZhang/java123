package com.javaeasy.usethread;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 17:48
 */
public class UseMyRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名类实现抽象方法。");
            }
        });
        thread.start();
    }
}
