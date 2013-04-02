package com.javaeasy.learnabstractclass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 14:50
 */
public class Teacher extends Person {
    public Teacher(String name) {
        super(name);
    }

    public void introduceSelf() {
        System.out.println("学生们好，我是一名老师，我的名字叫：" + getName());
    }
}
