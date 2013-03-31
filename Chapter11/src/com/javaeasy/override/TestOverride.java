package com.javaeasy.override;

import com.javaeasy.override.diffpkg.SubClassInDiffPkg;

/**
 * User: Bane
 * Date: 13-3-29
 * Time: 12:22
 */
public class TestOverride {
    public static void main(String[] args) {
        System.out.println("=====使用ParentClass的对象调用test()方法=====");
        ParentClass test = new ParentClass();
        test.test();
        System.out.println("=====使用SubClassInSamePkg的对象调用test()方法=====");
        SubClassInSamePkg subSame = new SubClassInSamePkg();
        subSame.test();
        System.out.println("=====使用SubClassInDiffPkg的对象调用test()方法=====");
        SubClassInDiffPkg subDiff = new SubClassInDiffPkg();
        subDiff.test();
    }
}
