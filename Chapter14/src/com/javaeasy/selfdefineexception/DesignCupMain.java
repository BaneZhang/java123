package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:18
 */
public class DesignCupMain {
    public static void main(String[] args) throws CapacityTooSmallException, CapacityTooBigException{
        if (args.length != 1) {
            System.out.println("请将杯子的容积作为参数传递给main()方法！");
            return;
        }

        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);

        int capacity = Integer.valueOf(args[0]);
        System.out.println("开始设计杯子，杯子的容积为：" + capacity);
        cupDesigner.designCupCapacity(capacity);
        System.out.println("设计杯子结束。");
    }
}
