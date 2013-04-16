package com.javaeasy.learnsockettcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * User: bane
 * Date: 13-4-16
 * Time: 下午10:32
 */
public class Client {
    public static void main(String[] args) {
        byte[] addr = new byte[]{127, 0, 0, 1};
        try {
            InetAddress local = InetAddress.getByAddress(addr);
            Socket s = new Socket(local, 7777);
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();
            System.out.println("======下面是服务端发来的消息======");
            System.out.println(response);
            System.out.println("===============================");
            System.out.println("正在向服务器端发送消息......");
            PrintWriter pw = new PrintWriter(out);
            pw.write("服务器你好，这里是客户端");
            pw.flush();
            pw.close();
            br.close();
            s.close();
            System.out.println("向服务器端发送消息结束。");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
