package com.javaeasy.threadsleep;

/**
 * User: bane
 * Date: 13-4-7
 * Time: 下午11:11
 */
public class TestAdding {
    public void giveAddingTest() {
        int a = (int) (100 * Math.random());
        int b = (int) (100 * Math.random());
        System.out.println("请在5秒钟内计算出下面两个整数的和：" + a + "+" + b);
        System.out.println("执行当前代码的线程名叫做：" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.print(e.getMessage());
            return;
        }
        System.out.println(a + "+" + b + "的运算结果是" + (a + b));
    }
}