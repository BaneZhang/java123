package com.javaeasy.communication;

import java.net.SocketAddress;

/**
 * User: Bane
 * Date: 13-4-22
 * Time: 17:34
 */
public interface MessageHandler {
    void handleMessage(byte[] data, SocketAddress address);
}
