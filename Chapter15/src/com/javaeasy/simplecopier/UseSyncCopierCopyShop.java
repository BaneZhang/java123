package com.javaeasy.simplecopier;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 12:09
 */
public class UseSyncCopierCopyShop {
    public static void main(String[] args) {
        Copier canon = new Copier("佳能");
        Employee simth = new Employee("Simth", 1, canon);
        Employee john = new Employee("John", 1, canon);
        simth.start();
        john.start();
    }
}
