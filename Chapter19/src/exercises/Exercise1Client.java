package exercises;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.net.Socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * User: Bane
 * Date: 13-4-17
 * Time: 10:46
 */
public class Exercise1Client {
    public static void main(String[] args) {
        try {
            byte[] addr = new byte[]{127, 0, 0, 1};
            InetAddress inetAddress = InetAddress.getByAddress(addr);
            Socket socket = new Socket(inetAddress, 9999);
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter.write(bufferedReader.readLine());
            bufferedReader.close();
            inputStreamReader.close();
            bufferedWriter.close();
            printWriter.close();
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
