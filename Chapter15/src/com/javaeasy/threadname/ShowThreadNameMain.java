package com.javaeasy.threadname;

/**
 * User: Bane
 * Date: 13-4-7
 * Time: 18:21
 */
public class ShowThreadNameMain {
    public static void main(String[] args) {
        ShowThreadName defaultName = new ShowThreadName();
        ShowThreadName name = new ShowThreadName("线程的名字");

        defaultName.start();
        name.start();
    }
}
