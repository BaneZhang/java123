package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 14:18
 */
public class ForceConvertion {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        CarBase base = sportsCar;
        System.out.println("尝试将base引用强制类型转换为SportsCar类的引用......");
        SportsCar converted = (SportsCar)base;
        System.out.println("转换成功！");
        System.out.println("使用converted调用addN()方法");
        converted.addN(45);
        System.out.println("converted.nAmout的值为：" + converted.nAmout);
        Object objCar = converted;
        System.out.println("将Object类引用强制类型转换为CarBase类引用");
        CarBase base2 = (CarBase)objCar;
        System.out.println("将Object类引用强制类型转换为SportsCar类引用");
        SportsCar sports2 = (SportsCar)objCar;
    }
}
