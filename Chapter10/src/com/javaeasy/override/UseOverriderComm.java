package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 16:05
 */
public class UseOverriderComm {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase base = sportsCar;
        System.out.println("========汽车加速开始========");
        System.out.println("加速前汽车的速度为：" + sportsCar.speed + "，剩余氮气为：" + sportsCar.nAmout);
        base.speedUp(50);
        System.out.println("加速后汽车的速度为：" + sportsCar.speed + "，剩余氮气为：" + sportsCar.nAmout);
        System.out.println("========汽车加速完毕========");
    }
}
