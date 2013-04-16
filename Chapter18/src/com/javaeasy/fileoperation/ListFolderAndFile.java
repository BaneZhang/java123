package com.javaeasy.fileoperation;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 11:26
 */
public class ListFolderAndFile {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("程序需要一个目录作为参数");
            return;
        }

        String folderPath = args[0];
        File folder = new File(folderPath);
        if (!folder.exists()) {
            System.out.println("不是有效的路径");
            return;
        }
        if (!folder.isDirectory()) {
            System.out.println("不是一个目录");
            return;
        }

        File[] allFiles = folder.listFiles();
        List<File> files = new ArrayList<File>();
        List<File> folders = new ArrayList<File>();
        for (int i = 0; i < allFiles.length; i++) {
            if (allFiles[i].isFile()) {
                files.add(allFiles[i]);
            } else {
                folders.add(allFiles[i]);
            }
        }

        System.out.println("文件夹\"" + folderPath + "\"中包含如下文件夹：");
        printPath(folders);
        System.out.println("文件夹\"" + folderPath + "\"中包含如下文件：");
        printPath(files);
    }

    private static void printPath(List<File> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
