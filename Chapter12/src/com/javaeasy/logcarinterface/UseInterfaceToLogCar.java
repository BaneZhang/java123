package com.javaeasy.logcarinterface;

import com.javaeasy.transport.*;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 21:07
 */
public class UseInterfaceToLogCar {
    public static void main(String[] args) {
        CarBase car = new CarBase("红色", "天津大发", 0);
        car.speedUp(50);
        TransportRecorderForLog.recordTransport(car);

        Bus bus = new Bus("黄色", "大桥六线", 0, 0, 0);
        bus.speedUp(60);
        TransportRecorderForLog.recordTransport(bus);

        Bike bike = new Bike();
        bike.setName("自行车一辆");
        bike.setSpeed(10);
        TransportRecorderForLog.recordTransport(bike);
    }
}
