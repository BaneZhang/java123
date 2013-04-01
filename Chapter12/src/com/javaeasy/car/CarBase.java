package com.javaeasy.car;

import com.javaeasy.logcar.TransportStatus;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:15
 */
public class CarBase {
    public int speed;
    public String name;
    public String color;

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

    public TransportStatus getTransportStatus() {
        TransportStatus carStatus = new TransportStatus(name, speed);
        return carStatus;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }
}
