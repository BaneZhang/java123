package com.javaeasy.logcar;

import com.javaeasy.car.CarBase;
import com.javaeasy.othertransport.Bike;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:32
 */
public class TransportRecorder {
    public static int counter = 0;
    public static void recordTransport(Object transportObj) {
        if (transportObj == null) {
            return;
        } else {
            counter++;
            TransportStatus status = null;
            if (transportObj instanceof CarBase) {
                CarBase car = (CarBase)transportObj;
                status = car.getTransportStatus();
            } else if (transportObj instanceof Bike) {
                Bike bike = (Bike)transportObj;
                status = bike.getTransportStatus();
            } else {
                return;
            }
            System.out.println("以下是经过的第" + counter + "辆车的信息：");
            System.out.println("车为：" + status.getName() + "，车速为：" + status.getSpeed());
        }
    }
}
