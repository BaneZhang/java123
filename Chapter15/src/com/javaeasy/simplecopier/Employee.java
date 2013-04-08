package com.javaeasy.simplecopier;

/**
 * User: Bane
 * Date: 13-4-8
 * Time: 11:17
 */
public class Employee extends Thread {
    private int workTimes;
    private Copier copier;

    public Employee(String name, int workTimes, Copier copier) {
        super(name);
        this.workTimes = workTimes;
        this.copier = copier;
    }

    public void run() {
        System.out.println(this.getName() + "\t开始工作");
        for (int i = 0; i < workTimes; i++) {
            System.out.println("\"" + this.getName() + "\"尝试调用\"" + copier.getName() + "\"的copyPages()方法");
            copier.copyPages((int) ((5 * Math.random()) + 1));
        }
        System.out.println(this.getName() + "\t完成了工作");
    }
}
