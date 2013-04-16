package com.javaeasy.fileoperation;

import java.io.File;
import java.io.IOException;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 10:57
 */
public class CreateFileAndFolder {
    public static void main(String[] args) {
        String folderPath = File.separator + "Users" + File.separator + "Bane" + File.separator + "Documents" + File.separator + "Labs" + File.separator + "java123" + File.separator + "chapter18";
        String fileName = "testingfile.txt";

        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            System.out.println("该文件夹已经存在了");
        } else {
            boolean createFolders = folder.mkdirs();
            if (createFolders) {
                System.out.println("文件夹创建成功");
            } else {
                System.out.println("文件夹创建失败");
                return;
            }
        }

        File file = new File(folder, fileName);
        if (file.exists() && file.isFile()) {
            System.out.println("文件已经存在，将文件删除！");
            boolean deleteFile = file.delete();
            if (deleteFile) {
                System.out.println("文件删除成功");
            } else {
                System.out.println("文件删除失败");
                return;
            }
        }
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
