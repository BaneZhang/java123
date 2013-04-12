package com.javaeasy.learnstring;

import java.io.UnsupportedEncodingException;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 14:24
 */
public class StringToByteArr {
    public static void main(String[] args) {
        try {
            String content = "字符串数组";
            byte[] contentBytes = content.getBytes("UTF-16BE");
            for (int i = 0; i < contentBytes.length; i++) {
                System.out.println(contentBytes[i]);
            }
            System.out.println("长度为" + content.length() + "的字符串在UTF-16BE编码下对应的字节数组长度为：" + contentBytes.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
    }
}
