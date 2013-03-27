package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-27
 * Time: 21:03
 */
public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;

    public void speedUp(int p_speed) {
        int tempSpeed = 0;
        if (p_speed > 0) {
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= maxSpeed) {
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
}
