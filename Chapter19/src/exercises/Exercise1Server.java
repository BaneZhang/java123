package exercises;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.File;

/**
 * User: Bane
 * Date: 13-4-17
 * Time: 10:31
 */
public class Exercise1Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            File file = new File("/Users/Bane/Documents/Labs/java123/chapter19/exercise1.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(bufferedReader.readLine());
            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
