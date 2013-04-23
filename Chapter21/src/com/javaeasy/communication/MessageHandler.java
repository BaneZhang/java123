package com.javaeasy.communication;

import java.net.SocketAddress;

public interface MessageHandler {
    void handleMessage(byte[] data, SocketAddress addr);
}
