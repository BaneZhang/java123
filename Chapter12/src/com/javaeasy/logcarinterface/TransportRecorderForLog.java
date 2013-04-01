package com.javaeasy.logcarinterface;

import com.javaeasy.transport.CarBase;
import com.javaeasy.transport.Bike;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:32
 */
public class TransportRecorderForLog {
    public static int counter = 0;
    public static void recordTransport(RecordeAble recordeAble) {
        if (recordeAble == null) {
            return;
        } else {
            counter++;
            TransportStatusForLog status = recordeAble.getTransportStatus();
            System.out.println("以下是经过的第" + counter + "辆车的信息：");
            System.out.println("车为：" + status.getName() + "，车速为：" + status.getSpeed());
        }
    }
}
