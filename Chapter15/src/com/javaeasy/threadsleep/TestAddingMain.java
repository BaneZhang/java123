package com.javaeasy.threadsleep;

/**
 * User: bane
 * Date: 13-4-7
 * Time: 下午11:17
 */
public class TestAddingMain {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                TestAdding testAdding = new TestAdding();
                testAdding.giveAddingTest();
            }
        };
        Thread thread = new Thread(runnable, "加法测试线程");
        thread.start();
        System.out.println("主线程结束了");
    }
}
