package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 15:57
 */
public class UseOverrideSimple {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        System.out.println("========跑车开始加速========");
        System.out.println("加速前跑车速度为：" + sportsCar.speed + "，剩余氮气为：" + sportsCar.nAmout);
        sportsCar.speedUp(50);
        System.out.println("加速后跑车速度为：" + sportsCar.speed + ",剩余氮气为：" + sportsCar.nAmout);
        System.out.println("========跑车加速完毕========");
    }
}