package com.javaeasy.fileoperation;

import java.io.File;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 11:46
 */
public class RenameFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("程序需要一个目录作为参数");
            return;
        }
        String filePath = args[0];
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("不是有效的路径");
            return;
        }
        if (!file.isFile()) {
            System.out.println("不是一个文件");
            return;
        }

        File renamedFile = new File(file.getParentFile(), "renamedFile");
        if (renamedFile.exists()) {
            System.out.println("文件名已被占用");
        }
        try {
            file.renameTo(renamedFile);
            System.out.println("重命名文件成功");
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
