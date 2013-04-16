package com.javaeasy.learnsockettcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * User: bane
 * Date: 13-4-16
 * Time: 下午10:17
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("服务器端在7777商品监听......");
            Socket s = ss.accept();
            System.out.println("已有客户端连接过来，开始进行通信");
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            PrintWriter pw = new PrintWriter(out);
            System.out.println("正在向客户端发送消息......");
            pw.write("客户端你好，这里是服务器端。\r\n");
            pw.flush();
            System.out.println("向客户端发送消息完成。");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String response = br.readLine();
            System.out.println("======下面是客户端发来的消息======");
            System.out.println(response);
            System.out.println("===============================");
            br.close();
            pw.close();
            s.close();
            ss.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
