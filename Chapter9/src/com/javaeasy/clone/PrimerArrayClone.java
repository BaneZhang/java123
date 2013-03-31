package com.javaeasy.clone;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 上午11:50
 */
public class PrimerArrayClone {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9};
        int[] cloneArr = arr.clone();

        arr[2] = 777;
        cloneArr[2] = 888;

        System.out.println("arr第三个元素的值是：" + arr[2]);
        System.out.println("cloneArr第三个元素的值是：" + cloneArr[2]);
    }
}
