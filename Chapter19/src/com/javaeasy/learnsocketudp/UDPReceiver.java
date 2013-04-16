package com.javaeasy.learnsocketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * User: bane
 * Date: 13-4-16
 * Time: 下午11:14
 */
public class UDPReceiver {
    public static void main(String[] args) {
        try {
            System.out.println("构建DatagramPacket对句......");
            byte[] data = new byte[1024];
            DatagramPacket dp = new DatagramPacket(data, data.length);
            System.out.println("使用DatagramPacket对象接收数据......");
            DatagramSocket ds = new DatagramSocket(7777);
            ds.receive(dp);
            System.out.println("数据接收完毕。");
            byte[] recData = dp.getData();
            int len = dp.getLength();
            String content = new String(recData, 0, len);
            System.out.println("接收到数据为：" + content);
            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
