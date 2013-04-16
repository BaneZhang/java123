package com.javaeasy.writeandread;

import java.io.*;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 15:22
 */
public class ConsoleToFile {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        PrintWriter printWriter;
        File file = prepareFile("/Users/Bane/Documents/Labs/java123/chapter18/consolefile.txt");
        if (file == null) {
            System.out.println("创建consolefile.txt出错，程序退出。");
            return;
        }
        try {
            printWriter = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }

        String content = null;
        String endMark = "end";
        try {
            System.out.println("请输入要写入文件的内容，以end结束：");
            while ((content = bufferedReader.readLine()) != null) {
                if (content.equalsIgnoreCase(endMark)) {
                    break;
                }
                printWriter.write(content + "\r\n");
            }
            printWriter.close();
            bufferedReader.close();
            inputStreamReader.close();
            System.out.println("输入结束");
        } catch (IOException e) {
            e.printStackTrace();
        }

        printFileContent(file);
    }

    private static File prepareFile(String path) {
        if (path == null) {
            return null;
        }

        File file = new File(path);
        if (file.exists() && file.isFile()) {
            return file;
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        return file;
    }

    private static void printFileContent(File file) {
        if (file.exists() && file.isFile()) {
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                System.out.println("文件内容为：");
                String content = null;
                while ((content = bufferedReader.readLine()) != null) {
                    System.out.println(content);
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
