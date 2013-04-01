package com.javaeasy.othertransport;

import com.javaeasy.logcar.TransportStatus;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:51
 */
public class Bike {
    private int speed;
    private String name;

    public TransportStatus getTransportStatus() {
        TransportStatus transportStatus = new TransportStatus(name, speed);
        return transportStatus;
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
