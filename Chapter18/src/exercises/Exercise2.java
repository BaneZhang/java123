package exercises;

import java.io.File;
import java.io.IOException;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 16:39
 */
public class Exercise2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("没有指定文件夹");
            return;
        }

        File folder = new File(args[0]);
        if (!(folder.exists() && folder.isDirectory())) {
            System.out.println(folder.getPath() + "不存在或不是文件夹");
        } else {
            File[] allFiles = folder.listFiles();
            for (int i = 0; i < allFiles.length; i++) {
                allFiles[i].delete();
                System.out.println("已删除" + allFiles[i].getName());
            }
        }
    }
}
