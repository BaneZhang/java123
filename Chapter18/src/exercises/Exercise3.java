package exercises;

import java.io.*;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 16:51
 */
public class Exercise3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("请传递正确的源文件和目标文件路径信息");
            return;
        }
        File sourceFilePath = new File(args[0]);
        File destinationFilePath = new File(args[1]);
        File destinationFolder = destinationFilePath.getParentFile();

        if (!(sourceFilePath.exists() && sourceFilePath.isFile())) {
            System.out.println(sourceFilePath.getPath() + "不存在或不是一个文件，程序结束");
            return;
        }

        if (!(destinationFolder.exists() && destinationFolder.isDirectory())) {
            boolean isOk = destinationFolder.mkdirs();
            if (isOk) {
                System.out.println("创建目录" + destinationFolder.getPath() + "成功");
            } else {
                System.out.println("创建目录" + destinationFolder.getPath() + "失败，程序结束");
            }
        }

        if (!(destinationFilePath.exists() && destinationFilePath.isFile())) {
            try {
                destinationFilePath.createNewFile();
                System.out.println("创建文件" + destinationFilePath.getPath() + "成功");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("创建文件" + destinationFilePath.getPath() + "失败，程序结束");
                return;
            }
        }

        try {
            FileReader fileReader = new FileReader(sourceFilePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(destinationFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String content = null;
            while ((content = bufferedReader.readLine()) != null) {
                bufferedWriter.write(content);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("成功将" + sourceFilePath.getPath() + "内容复制到" + destinationFilePath.getPath() + "中。");
    }
}
