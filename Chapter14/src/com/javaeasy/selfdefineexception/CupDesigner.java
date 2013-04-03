package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:14
 */
public class CupDesigner {
    private Cup cup;

    public CupDesigner(Cup cup) {
        this.cup = cup;
    }

    public void designCupCapacity(int capacity) throws CapacityTooSmallException, CapacityTooBigException{
        cup.setCapacity(capacity);
        System.out.println("成功设计出了容积为" + capacity + "的杯子。");
    }
}
