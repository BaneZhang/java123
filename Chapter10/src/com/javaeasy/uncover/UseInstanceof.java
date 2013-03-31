package com.javaeasy.uncover;

import com.javaeasy.override.*;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 17:58
 */
public class UseInstanceof {
    public static void main(String[] args) {
        ElectronicBus eBus = new ElectronicBus();
        CarBase base = eBus;
        String message = null;
        if (base instanceof Object) {
            message = "Object";
        } else {
            message = "Not Object";
        }
        System.out.println(message);
        if (base instanceof CarBase) {
            message = "CarBase";
        } else {
            message = "Not CarBase";
        }
        System.out.println(message);
        if (base instanceof Bus) {
            message = "Bus";
        } else {
            message = "not Bus";
        }
        System.out.println(message);
        if (base instanceof ElectronicBus) {
            message = "ElectronicBus";
        } else {
            message = "not ElectronicBus";
        }
        System.out.println(message);
        if (base instanceof SportsCar) {
            message = "SportsCar";
        } else {
            message = "not SportsCar";
        }
        System.out.println(message);
    }
}
