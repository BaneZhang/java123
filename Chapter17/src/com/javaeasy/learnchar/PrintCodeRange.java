package com.javaeasy.learnchar;

/**
 * User: Bane
 * Date: 13-4-12
 * Time: 12:20
 */
public class PrintCodeRange {
    public static void main(String[] args) {
        if (args.length == 2) {
            int begin = 0;
            int end = 0;
            try {
                begin = Integer.valueOf(args[0]);
                end = Integer.valueOf(args[1]);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                return;
            }
            for (int i = begin; i <= end; i++) {
                System.out.print((char)i);
            }
        }
    }
}
