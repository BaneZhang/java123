package com.javaeasy.clone;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 上午11:55
 */
public class ObjArrClone {
    public static void main(String[] args) {
        TestClone[] arr = new TestClone[2];
        arr[1] = new TestClone();

        TestClone[] cloneArr = arr.clone();
        arr[1].value = 777;
        cloneArr[1].value = 999;

        System.out.println("arr第二个元素的值是：" + arr[1].value);
        System.out.println("cloneArr第二个元素的值是：" + cloneArr[1].value);

        cloneArr[1] = new TestClone();
        arr[1].value = 777;
        cloneArr[1].value = 999;

        System.out.println("arr第二个元素的值是：" + arr[1].value);
        System.out.println("cloneArr第二个元素的值是：" + cloneArr[1].value);
    }
}
