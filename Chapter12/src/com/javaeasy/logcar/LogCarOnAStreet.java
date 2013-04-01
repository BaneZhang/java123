package com.javaeasy.logcar;

import com.javaeasy.car.*;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:35
 */
public class LogCarOnAStreet {
    public static void main(String[] args) {
        CarBase car = null;
        car = new CarBase("红色", "天津大发", 0);
        car.speedUp(50);
        TransportRecorder.recordTransport(car);

        car = new Bus("黄色", "大桥六线", 0, 0, 0);
        car.speedUp(60);
        TransportRecorder.recordTransport(car);

        car = new SportsCar("黄色", "Eclipse", 0, 0);
        car.speedUp(70);
        TransportRecorder.recordTransport(car);
    }
}
