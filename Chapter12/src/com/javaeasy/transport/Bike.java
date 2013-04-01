package com.javaeasy.transport;

import com.javaeasy.logcarinterface.TransportStatusForLog;
import com.javaeasy.logcarinterface.RecordeAble;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:51
 */
public class Bike implements RecordeAble {
    private int speed;
    private String name;

    public TransportStatusForLog getTransportStatus() {
        TransportStatusForLog statusForLog = new TransportStatusForLog(name, speed);
        return statusForLog;
    }

    public TransportStatusForLog getTransportStatusForLog() {
        TransportStatusForLog transportStatusForLog = new TransportStatusForLog(name, speed);
        return transportStatusForLog;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            return;
        } else {
            this.speed = speed;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            return;
        } else {
            this.name = name;
        }
    }
}
