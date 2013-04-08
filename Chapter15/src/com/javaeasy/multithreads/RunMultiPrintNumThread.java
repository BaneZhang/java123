package com.javaeasy.multithreads;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 10:46
 */
public class RunMultiPrintNumThread {
    public static void main(String[] args) {
        PrintNumberThread thread1 = new PrintNumberThread(5);
        PrintNumberThread thread2 = new PrintNumberThread(5);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
        System.out.println("主线程结束了");
    }
}
