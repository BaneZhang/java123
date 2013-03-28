package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 12:35
 */
public class AutoConversion {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase carBase = sportsCar;
        carBase.speedUp(77);
        System.out.println("carBase.speed的值为：" + carBase.speed);
        System.out.println("sportsCar.speed的值为：" + sportsCar.speed);
        sportsCar.speedUpUsingN(77);
        System.out.println("carBase.speed的值为：" + carBase.speed);
        System.out.println("sportsCar.speed的值为：" + sportsCar.speed);
    }
}
