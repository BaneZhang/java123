package com.javaeasy.transport;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:26
 */
public class SportsCar extends CarBase {
    public int nAmout = 90; //氮气剩余量

    public SportsCar(String color, String name, int speed, int amount) {
        super(color, name, speed);
        nAmout = amount;
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
