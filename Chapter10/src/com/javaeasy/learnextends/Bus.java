package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-27
 * Time: 21:09
 */
public class Bus extends CarBase {
    public int max_Passenger = 35;
    public int current_Passenger = 0;

    public Bus() {
        System.out.println("Bus类的构造方法被调用了！");
    }

    public Bus(String color, int maxSpeed, String name, int speed, int current_Passenger, int max_Passenger) {
        super(color, maxSpeed, name, speed);
        this.current_Passenger = current_Passenger;
        this.max_Passenger = max_Passenger;

        System.out.println("Bus类有参数的构造方法被调用了！");
    }

    public boolean getOnBus(int p_amout) {
        if (p_amout > 0) {
            int temp = current_Passenger + p_amout;
            if (temp > max_Passenger) {
                return false;
            } else {
                current_Passenger = temp;
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean getDownBus(int p_amout) {
        if (p_amout > 0) {
            int temp = current_Passenger - p_amout;
            if (temp < 0) {
                return false;
            } else {
                current_Passenger = temp;
                return true;
            }
        } else {
            return false;
        }
    }
}
