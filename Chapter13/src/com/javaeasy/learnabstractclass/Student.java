package com.javaeasy.learnabstractclass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 14:48
 */
public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void introduceSelf() {
        System.out.println("嗨，大家好，我是一名学生，我的名字叫：" + getName());
    }
}
