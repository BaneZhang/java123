package com.javaeasy.learnstring;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午3:38
 */
public class UsingStringBuffer {
    public static void main(String[] args) {
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(true);
        strBuffer.append("test");
        strBuffer.append('\t');
        for (int i = 0; i < 3; i++) {
            strBuffer.append(i);
        }

        String str = strBuffer.toString();
        System.out.println(str);
        strBuffer.insert(1, "插入字符");
        System.out.println(strBuffer.toString());
        strBuffer.delete(0, 4);
        System.out.println(strBuffer.toString());
        strBuffer.replace(0, 1, "替换");
        System.out.println(strBuffer.toString());
        strBuffer.reverse();
        System.out.println(strBuffer.toString());
    }
}
