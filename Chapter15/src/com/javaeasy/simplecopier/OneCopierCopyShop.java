package com.javaeasy.simplecopier;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 11:29
 */
public class OneCopierCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Employee simth = new Employee("simth", 2, canon);
        Employee john = new Employee("John", 2, canon);
        simth.start();
        john.start();
    }
}
