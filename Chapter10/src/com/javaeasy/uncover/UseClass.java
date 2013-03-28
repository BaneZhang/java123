package com.javaeasy.uncover;

import com.javaeasy.override.*;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 17:39
 */
public class UseClass {
    public static void main(String[] args) {
        CarBase base = new SportsCar();
        Class clazz = base.getClass();
        System.out.println("base引用指向的对象所属的类是：" + clazz.getName());
    }
}
