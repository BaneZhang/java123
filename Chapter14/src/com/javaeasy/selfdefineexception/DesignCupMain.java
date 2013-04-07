package com.javaeasy.selfdefineexception;

/**
 * User: Bane
 * Date: 13-4-3
 * Time: 18:18
 */
public class DesignCupMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("请将杯子的容积作为参数传递给main()方法！");
            return;
        }

        Cup cup = new Cup();
        CupDesigner cupDesigner = new CupDesigner(cup);

        int capacity = Integer.valueOf(args[0]);
        System.out.println("开始设计杯子，杯子的容积为：" + capacity);
        try {
            cupDesigner.designCupCapacity(capacity);
        } catch (CapacityTooBigException e) {
            System.out.println("捕捉到了CapacityTooBigException异常。异常信息如下：");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最大的杯子容积设计杯子：");
            try {
                cupDesigner.designCupCapacity(10000);
            } catch (CapacityTooBigException e1) {
            } catch (CapacityTooSmallException e1) {
            }
        } catch (CapacityTooSmallException e) {
            System.out.println("捕捉到了CapacityTooSmallException异常。异常信息如下：");
            System.out.println(e.getMessage());
            System.out.println("尝试使用最小的杯子容积设计杯子：");
            try {
                cupDesigner.designCupCapacity(0);
            } catch (CapacityTooBigException e1) {
            } catch (CapacityTooSmallException e1) {
            }

        }

        System.out.println("设计杯子结束。");
    }
}
