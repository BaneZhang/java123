package com.javaeasy.override;

/**
 * User: Bane
 * Date: 13-3-28
 * Time: 15:41
 */
public class SportsCar extends CarBase{
    public int nAmout = 90; //氮气剩余量
    public int autoUsingN = 5;

    public SportsCar() {
        System.out.println("SportsCar类的构造方法被调用了！");
    }

    public SportsCar(String color, int maxSpeed, String name, int speed, int amount) {
        super(color, maxSpeed, name, speed);
        nAmout = amount;

        System.out.println("SportsCar类有参数的构造方法被调用了！");
    }

    public void speedUp(int p_speed) {
        System.out.println("SportsCar类中定义的speedUp(int)方法被调用了。");
        if (nAmout >= autoUsingN) {
            nAmout -= autoUsingN;
        } else {
            nAmout = 0;
        }

        super.speedUp(p_speed);
    }

    public void speedUpUsingN(int p_amout) {
        if (p_amout > 0) {
            int realAmout = 0;  //真正用于加速的氮气量
            if (nAmout <= p_amout) {
                realAmout = nAmout;
                nAmout = 0;
            } else {
                realAmout = p_amout;
                nAmout -= p_amout;
            }
            int speedUp = (int)(realAmout * 0.25);
            speed += speedUp;
        }
    }

    public void addN(int p_amout) {
        if (p_amout < 0) {
            return;
        } else {
            nAmout += p_amout;
        }
    }

}
