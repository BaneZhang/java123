package com.javaeasy.writeandread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 14:31
 */
public class ReadDataFromFile {
    public static void main(String[] args) {
        File file = new File("/Users/Bane/Code/java123.git/README.md");
        if (file.exists() && file.isFile()) {
            System.out.println("从datafile.txt中读取数据");
        } else {
            System.out.println("datafile.txt文件不存在");
            return;
        }
        System.out.println("文件中的内容为：");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content = null;
            while ((content = bufferedReader.readLine()) != null) {
                System.out.println(content);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
