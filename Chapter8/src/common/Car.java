package common;

import common.special.RaceCar;

/**
 * User: Bane
 * Date: 13-3-25
 * Time: 下午5:22
 */
public class Car {
    public static void main(String[] args) {
        System.out.println((new RaceCar()).packageName);
        System.out.println((new common.RaceCar()).packageName);
    }
}
