package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 16:15
 */
public class UsingPara {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(90);
        System.out.println("sportsCar的速度为：" + sportsCar.speed);
        bus.followSpeed(sportsCar);
        System.out.println("bus的速度为：" + bus.speed);
    }
}
