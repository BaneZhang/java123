package com.javaeasy.transport;

/**
 * User: Bane
 * Date: 13-4-1
 * Time: 17:24
 */
public class Bus extends CarBase {
    public int max_Passenger = 35;
    public int current_Passenger = 0;

    public Bus(String color, String name, int speed, int current_Passenger, int max_Passenger) {
        super(color, name, speed);
        this.current_Passenger = current_Passenger;
        this.max_Passenger = max_Passenger;
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
