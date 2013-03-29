package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 12:14
 */
public class SubClassInSamePkg extends ParentClass {
    private void privateMethod() {
        System.out.println("这是类SubClassInSamePkg中的privateMethod()方法");
    }

    void defaultMethod() {
        System.out.println("这是类SubClassInSamePkg中的defaultMethod()方法");
    }

    protected void protectedMethod() {
        System.out.println("这是类SubClassInSamePkg中的protectedMethod()方法");
    }

    public void publicMethod() {
        System.out.println("这是类SubClassInSamePkg中的publicMethod()方法");
    }
}
