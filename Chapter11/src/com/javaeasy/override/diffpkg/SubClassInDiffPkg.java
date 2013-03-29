package com.javaeasy.override.diffpkg;

import com.javaeasy.override.ParentClass;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 12:19
 */
public class SubClassInDiffPkg extends ParentClass {
    private void privateMethod() {
        System.out.println("这是类SubClassInDiffPkg中的privateMethod()方法");
    }

    void defaultMethod() {
        System.out.println("这是类SubClassInDiffPkg中的defaultMethod()方法");
    }

    protected void protectedMethod() {
        System.out.println("这是类SubClassInDiffPkg中的protectedMethod()方法");
    }

    public void publicMethod() {
        System.out.println("这是类SubClassInDiffPkg中的publicMethod()方法");
    }
}
