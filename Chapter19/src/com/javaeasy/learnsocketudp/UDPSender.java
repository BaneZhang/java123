package com.javaeasy.learnsocketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * User: bane
 * Date: 13-4-16
 * Time: 下午11:29
 */
public class UDPSender {
    public static void main(String[] args) {
        try {
            System.out.println("构建DatagramPacket对象......");
            String content = "使用UDP传输数据。";
            byte[] data = content.getBytes();
            DatagramPacket dp = new DatagramPacket(data, data.length);
            byte[] addr = new byte[]{127, 0, 0, 1};
            InetAddress local = InetAddress.getByAddress(addr);
            dp.setAddress(local);
            dp.setPort(7777);
            System.out.println("发送Datagram对象......");
            DatagramSocket ds = new DatagramSocket();
            ds.send(dp);
            System.out.println("发送结束。");
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
