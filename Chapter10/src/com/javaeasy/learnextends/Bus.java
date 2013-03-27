package com.javaeasy.learnextends;

/**
 * User: Bane
 * Date: 13-3-27
 * Time: 21:09
 */
public class Bus extends CarBase {
    public int max_Passenger = 35;
    public int current_Passenger = 0;

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
