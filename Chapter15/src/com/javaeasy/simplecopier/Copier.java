package com.javaeasy.simplecopier;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 11:13
 */
public class Copier {
    private String name;

    public Copier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void copyPages(int pages) {
        Thread employee = Thread.currentThread();
        System.out.println(employee.getName() + "\t正在使用复印机\t" + name);
        long time = pages * 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println(employee.getName() + "\t用完了复印机\t" + name);
    }
}
