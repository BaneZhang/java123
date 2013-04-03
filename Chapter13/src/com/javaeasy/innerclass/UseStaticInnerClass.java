package com.javaeasy.innerclass;

import com.javaeasy.innerclass.UseInnerClassOutside.StaticInnerClass;

/**
 * User: Bane
 * Date: 13-4-2
 * Time: 16:34
 */
public class UseStaticInnerClass {
    public static void main(String[] args) {
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println("内部类方法的返回值：" + staticInnerClass.getVariable());
    }
}
