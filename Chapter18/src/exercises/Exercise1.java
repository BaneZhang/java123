package exercises;

import java.io.File;
import java.io.IOException;

/**
 * User: Bane
 * Date: 13-4-16
 * Time: 16:16
 */
public class Exercise1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("没有指定要创建的文件路径");
            return;
        }

        File filePath = new File(args[0]);
        File folder = filePath.getParentFile();
        File file = new File(folder, filePath.getName());

        if (!(folder.exists() && folder.isDirectory())) {
            if (!folder.mkdirs()) {
                System.out.println("创建文件夹失败，程序退出");
                return;
            }
        }

        if (!(file.exists() && file.isFile())) {
            try {
                file.createNewFile();
                System.out.println("创建文件" + file.getName() + "成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(file.getName() + "已经存在");
        }
    }
}
