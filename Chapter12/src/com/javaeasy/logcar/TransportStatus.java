package com.javaeasy.logcar;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:12
 */
public class TransportStatus {
    private String name;
    private int speed;

    public TransportStatus(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
