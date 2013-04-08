package com.javaeasy.simplecopier;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 11:23
 */
public class SimpleCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Copier sharp = new Copier("夏普");

        Employee simth = new Employee("Simth", 2, canon);
        Employee john = new Employee("John", 1, sharp);
        simth.start();
        john.start();
    }
}
