package com.javaeasy.learnabstractclass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 14:51
 */
public class Schoolmaster extends Person {
    public Schoolmaster(String name) {
        super(name);
    }

    public void introduceSelf() {
        System.out.println("大家好，我是本校校长，我的名字叫：" + getName());
    }
}
