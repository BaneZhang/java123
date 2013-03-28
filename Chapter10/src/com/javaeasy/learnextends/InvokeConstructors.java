package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 12:27
 */
public class InvokeConstructors {
    public static void main(String[] args) {
        System.out.println("========开始创建Bus类的对象========");
        Bus bus = new Bus();
        System.out.println("========创建Bus类的对象结束========");
        System.out.println();
        System.out.println("========开始创建SportsCar类的对象========");
        SportsCar sportsCar = new SportsCar("红色", 200, "红色跑车", 0, 90);
        System.out.println("========创建SportsCar类的对象结束========");
    }
}
