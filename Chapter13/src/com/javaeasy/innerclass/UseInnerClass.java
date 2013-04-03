package com.javaeasy.innerclass;

import com.javaeasy.innerclass.UseInnerClassOutside.InnerClass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 16:31
 */
public class UseInnerClass {
    public static void main(String[] args) {
        UseInnerClassOutside outside = new UseInnerClassOutside();
        InnerClass innerClass = outside.new InnerClass();
        System.out.println("内部类方法的返回值：" + innerClass.getVariable());
    }
}
