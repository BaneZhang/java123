package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 16:24
 */
public class FirstBug {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        Bus bus = new Bus();
        sportsCar.speedUp(30);
        bus.speedUp(70);
        System.out.println("bus的速度为：" + bus.speed);
        System.out.println("sportsCar的速度为：" + sportsCar.speed);
        System.out.println("bus开始followUp参数sportsCar");
        bus.followSpeed(sportsCar); //覆盖是为了寻求不同，而followSpeed又是为了寻求相同，所以出现bug
        System.out.println("bus的速度为：" + bus.speed);
        System.out.println("sportsCar的速度为：" + sportsCar.speed);
    }
}
