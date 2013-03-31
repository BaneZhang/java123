package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 16:20
 */
public class WhichMethod {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        bus.speedUp(90);
        System.out.println("bus的速度为：" + bus.speed);
        System.out.println("sportsCar开始followUp参数bus");
        sportsCar.followSpeed(bus);
        System.out.println("followUp结束");
        System.out.println("sportsCar的速度为：" + sportsCar.speed);
    }
}
