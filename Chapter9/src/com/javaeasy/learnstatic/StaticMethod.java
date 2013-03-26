package com.javaeasy.learnstatic;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午4:51
 */
public class StaticMethod {
    static int base = 6;
    int variable = 7;

    public static void staticMethod1(int a) {
//        commMethod(variable);   //类方法中不能调用非static方法
        StaticMethod obj = new StaticMethod();
        obj.commMethod(a);
        StaticMethod.staticMethod2(a + StaticMethod.base);
        staticMethod2(a + base);
        System.out.println("类方法staticMethod1被调用了，参数为：" + a);
    }

    public void commMethod(int a) {
        System.out.println("commMethod可以使用类变量" + StaticMethod.base);
        staticMethod2(variable);
        System.out.println("方法commMethod被调用了，参数为：" + a);
    }

    public static void staticMethod2(int a) {
        System.out.println("类方法staticMethod2被调用了，参数为：" + a);
    }
}
