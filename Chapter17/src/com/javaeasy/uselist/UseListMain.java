package com.javaeasy.uselist;

import java.util.List;
import java.util.ArrayList;

/**
 * User: Bane
 * Date: 13-4-11
 * Time: 11:45
 */
public class UseListMain {
    public static void printList(List list) {
        int size = list.size();
        System.out.println("列表大小为：" + size + "。其中元素为：");
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i) + ",");
        }
        System.out.println("\n======列表内容结束======\n");
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        String str1 = "字符串1";
        String str2 = "字符串2";
        String str3 = "字符串3";

        list.add(str1);
        list.add(str3);
        printList(list);
        list.add(1, str2);
        printList(list);
        list.set(1, str3);
        printList(list);
        list.remove(0);
        printList(list);
    }
}
