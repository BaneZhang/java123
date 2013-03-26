package com.javaeasy.clone;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午12:08
 */
public class MultiArrayClone {
    public static void main(String[] args) {
        int[][] multiArr = new int[2][3];
        int[][] cloneMultiArr = multiArr.clone();

        cloneMultiArr[1][2] = 999;
        System.out.println("multiArr[1][2]的值为：" + multiArr[1][2]);
        System.out.println("cloneMultiArr[1][2]的值为：" + cloneMultiArr[1][2]);

        cloneMultiArr[1] = multiArr[1].clone(); //基本上可以总结为数组clone()仅克隆一层
        cloneMultiArr[1][2] = 777;
        multiArr[1][2] = 999;
        System.out.println("multiArr[1][2]的值为：" + multiArr[1][2]);
        System.out.println("cloneMultiArr[1][2]的值为：" + cloneMultiArr[1][2]);
    }
}