package com.javaeasy.learnstring;

import java.io.UnsupportedEncodingException;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 14:38
 */
public class ByteArrToString {
    public static void main(String[] args) {
        try {
//            byte[] bytes = new byte[]{0x5f, (byte) 0x97, 0x4e, 0x4b, 0x4e, 0x0d, (byte) 0x96, (byte) 0xbe, (byte) 0xff, 0x0c, 0x59, 0x31, 0x4e, 0x4b, 0x5f, (byte) 0xc5, 0x66, 0x13, 0x30, 0x02};
            byte[] bytes = {0x5f, (byte) 0x97, 0x4e, 0x4b, 0x4e, 0x0d, (byte) 0x96, (byte) 0xbe, (byte) 0xff, 0x0c, 0x59, 0x31, 0x4e, 0x4b, 0x5f, (byte) 0xc5, 0x66, 0x13, 0x30, 0x02};
            String string = new String(bytes, "UTF-16BE");
            System.out.println(string);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return;
        }
    }
}
