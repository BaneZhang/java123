package exercises;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


/**
 * User: Bane
 * Date: 13-4-17
 * Time: 11:53
 */
public class Exercise2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("没有指定文件路径或和远程IP地址");
            return;
        }

        try {
            String filePath = args[0];
            String ipAddress = args[1];
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Socket socket = new Socket(ipAddress, 9999);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);

            String content = null;
            while ((content = bufferedReader.readLine()) != null) {
                printWriter.write(content);
            }

            bufferedReader.close();
            fileReader.close();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
