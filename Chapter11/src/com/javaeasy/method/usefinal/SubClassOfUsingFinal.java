package com.javaeasy.method.usefinal;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 15:22
 */
public class SubClassOfUsingFinal extends UsingFinalInMethod {
    /*//无法覆盖使用final修饰的方法
    public final void finalMethod() {
        System.out.println("尝试覆盖父类中的final方法");
    }*/

    public void commonMethod() {
        System.out.println("覆盖父类中的普通方法。");
    }
}
