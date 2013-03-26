package com.javaeasy.learnarray;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 上午11:47
 */
public class LenOfMultiArray {
    public static void main(String[] args) {
        int[][] multiArray = new int[9][19];
        System.out.println("第一维长度为：" + multiArray.length);
        System.out.println("第二维长度为：" + multiArray[0].length);
    }
}
