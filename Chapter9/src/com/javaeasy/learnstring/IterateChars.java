package com.javaeasy.learnstring;

/**
 * User: Bane
 * Date: 13-3-26
 * Time: 下午4:01
 */
public class IterateChars {
    public static void main(String[] args) {
        if (args != null) {
            String str = null;
            char target = ' ';

            if ((args.length == 2) && (args[1].length() == 1)) {
                str = args[0];
                target = args[1].charAt(0);
            }

            int len = str.length();
            int count = 0;
            for (int i = 0; i < len; i++) {
                char ch = str.charAt(i);
                if (ch == target) {
                    count++;
                }
            }
            System.out.println("字符串\"" + str + "\"中包含" + count + "个\'" + target + "\'字符。");
        }
    }
}
