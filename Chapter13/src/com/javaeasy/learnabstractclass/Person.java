package com.javaeasy.learnabstractclass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 14:45
 */
public abstract class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void introduceSelf();
}
