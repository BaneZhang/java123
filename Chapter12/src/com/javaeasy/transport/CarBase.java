package com.javaeasy.transport;

import com.javaeasy.logcarinterface.TransportStatusForLog;
import com.javaeasy.logcarinterface.RecordeAble;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:15
 */
public class CarBase implements RecordeAble {
    public int speed;
    public String name;
    public String color;


    public TransportStatusForLog getTransportStatus() {
        TransportStatusForLog statusForLog = new TransportStatusForLog(name, speed);
        return statusForLog;
    }

    public CarBase(String color, String name, int speed) {
        this.color = color;
        this.name = name;
        this.speed = speed;
    }

    public void speedUp(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0) {
            tempSpeed = speed + p_speed;
            speed = tempSpeed;
        }
    }

    public void slowDown(int p_speed) {
        if (p_speed > 0) {
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0) {
                speed = tempSpeed;
            }
        }
    }

    public TransportStatusForLog getTransportStatusForLog() {
        TransportStatusForLog transportStatusForLog = new TransportStatusForLog(name, speed);
        return transportStatusForLog;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
