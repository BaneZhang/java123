package com.javaeasy.writeandread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 12:13
 */
public class WriteDataToFile {
    public static void main(String[] args) {
        File dataFile = new File("/Users/Bane/Documents/Labs/java123/chapter18/datafile.txt");
        if (dataFile.exists() && dataFile.isFile()) {
            System.out.println("使用已经存在的datafile.txt文件");
        } else {
            try {
                dataFile.createNewFile();
                System.out.println("创建datafile.txt文件");
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } catch (SecurityException e) {
                e.printStackTrace();
                return;
            }
        }

        try {
            PrintWriter printWriter = new PrintWriter(dataFile);
            printWriter.write("向文件中写入数据。");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
