package com.javaeasy.learnchar;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 12:15
 */
public class PrintCharCoder {
    public static void main(String[] args) {
        if (args.length == 1 && args[0].length() > 0) {
            char ch = args[0].charAt(0);
            int value = ch;
            System.out.println("字符\"" + ch + "\"对应的编码是：" + value);
        }
    }
}
