package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 15:38
 */
public class CarBase {
    public int speed;
    public String name;
    public String color;
    public int maxSpeed = 90;

    public CarBase() {
        System.out.println("CarBase类的构造方法被调用了！");
    }

    public CarBase(String color, int maxSpeed, String name, int speed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.speed = speed;

        System.out.println("CarBase类的有参数的构造方法被调用了！");
    }

    public void followSpeed(CarBase car) {
        int newSpeed = car.speed;
        if (newSpeed > this.speed) {
            speedUp(newSpeed - this.speed);
        } else {
            slowDown(this.speed - newSpeed);
        }
    }

    public void speedUp(int p_speed) {
        System.out.println("CarBase类中定义的speedUp(int)方法被调用了。");
        int tempSpeed = 0;
        if (p_speed > 0) {
            tempSpeed = speed + p_speed;
        }
        if (tempSpeed <= maxSpeed) {
            speed = tempSpeed;
        }
    }

    public void slowDown(int p_speed) {
        System.out.println("CarBase类中定义的slowDown(int)方法被调用了。");
        if (p_speed > 0) {
            int tempSpeed = speed - p_speed;
            if (tempSpeed >= 0) {
                speed = tempSpeed;
            }
        }
    }
}
