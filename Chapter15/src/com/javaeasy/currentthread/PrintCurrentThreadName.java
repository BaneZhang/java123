package com.javaeasy.currentthread;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 18:23
 */
public class PrintCurrentThreadName {
    public void printCurrentThreadName() {
        System.out.println("执行代码的线程名叫做：" + Thread.currentThread().getName());
    }
}
