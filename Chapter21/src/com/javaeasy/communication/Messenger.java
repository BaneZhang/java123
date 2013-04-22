package com.javaeasy.communication;

import java.net.SocketAddress;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 17:36
 */
public interface Messenger {
    public void setMessageHandler(MessageHandler handler);
    public void sendData(byte[] data, SocketAddress address);
    public void startMessenger();
}
